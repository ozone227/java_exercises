import java.util.*;

public class Driver {
	public static void main(String[] args) {
				String Expr1 = "1 2 + 4 * 5 -";
				String Expr2 = "1 2 4 1 - / 5 3 * +";
		        System.out.println("Expression 1:  " + Calculator(Expr1));
		        System.out.println("Expression 2:  "+ Calculator(Expr2));
		    }
		    @SuppressWarnings("resource")
			public static int Calculator(String exp) {
				Scanner scanOprs = new Scanner(exp); // Create a Scanner Object to Process Each Expression
			 	Stack<Integer>operandStack = new Stack<Integer> (); // Create a Stack to Store Operands
				while (scanOprs.hasNext()) {
					if (scanOprs.hasNextInt()) { //For every Integer in the expression, store in the Stack.
						operandStack.push(scanOprs.nextInt());
					} else {
						int data1 = operandStack.pop();
						int data2 = operandStack.pop();
						String opr = scanOprs.next();
						// For Each non-integer, apply the Operator to the Operands and push.
						if (opr.equals("+")) {
							operandStack.push(data2 + data1);
						} else if (opr.equals("-")) {
							operandStack.push(data2 - data1);
						} else if (opr.equals("*")) {
							operandStack.push(data2 * data1);
						} else if (opr.equals("/")){
							operandStack.push(data2 / data1);
						}
					}
				}
				return operandStack.pop(); //Pop the remaining Value from the Stack
		    }
}
