This is a simple implementation of Djikstra's Interpreter algorithm utilizing Java's built in stack classes. The fundamental theory of the algorithm is to traverse
through the expression and pushing elements of the expression into either the operators stack or the values stack and performing operations when the iterator reaches
a right parenthesis and then popping off the last element pushed into the operators stack and popping off the last two values pushed onto the values stack and performing
the operation based upon that value that was popped off the operators stack and then pushing that result onto the values stack. Please note that this is a very simple 
implementation and currently the implementation only supports addition and multiplication operations.