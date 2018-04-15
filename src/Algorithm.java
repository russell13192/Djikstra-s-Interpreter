import java.util.Stack;

public class Algorithm {
    private Stack<String> operationStack;
    private Stack<Double> valueStack;

    public Algorithm() {
        // Instantiate Stack for operations
        this.operationStack = new Stack<>();
        // Instantiate Stack for values
        this.valueStack = new Stack<>();
    }

    public void interpretExpression(String expression) {
        // Argument for function call is passed in as a single string -> must split up string sp
        // we can implement iterator to iterate and push values or operators onto the stack
        String[] expressionArray = expression.split(" ");

        // Iterate through the express
        for (String s : expressionArray) {
            // Do nothing as this is the beginning of a parenthesis expression in accordance with order of operations

            if (s.equals("(")) {
                // Do nothing
            } else if (s.equals("+")) {
                // Push addition operator onto stack
                this.operationStack.push(s);
                // Push multiplication operator
            } else if (s.equals("*")) {
                this.operationStack.push(s);
                // If right parenthesis then perform operation
            } else if (s.equals(")")) {
                // Grab the last operator pushed onto the stack
                String operation = this.operationStack.pop();
                // Perform addition operation if value popped off of operation stack is addition
                // by popping off the last two values pushed onto stack
                if (operation.equals("+")) {
                    this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
                }
                // Perform addition operation if value popped off of operation stack is addition
                // by popping off the last two values pushed onto stack
                else if (operation.equals("*")) {
                    this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
                }
            } else {
                // if s is not an operation it is a value and must be pushed onto the value stack
                this.valueStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result() {
        // Print out last object push onto stack which in accordance with the algorithm will be the final result
        System.out.println(this.valueStack.pop());
    }
}
