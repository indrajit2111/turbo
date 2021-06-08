package trainingassign;

public class Exception1 {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 10;
		char opr = '&';
		try {
			if (num1 > 1000 || num2 > 1000) {
				throw new NumberIsLargeException("Number cannot be greater than 1000");
			} else if (num1 < 0 || num2 < 0) {
				throw new NumberIsNegativeException("Number is Negative");
			} else if (opr != '+' && opr != '-' && opr != '*') {
				throw new Exception("is not a valid operator");
			} else {
				System.out.println("No Exceptions found");
			}
		} catch (NumberIsLargeException ne) {
			System.out.println(ne.getMessage());
		} catch (NumberIsNegativeException ni) {
			System.out.println(ni.getMessage());
		} catch (Exception o) {
			System.out.println(opr +" "+ o.getMessage());
		}
	}
}

class NumberIsLargeException extends Exception {
	public NumberIsLargeException(String string) {
		super(string);
	}
}

class NumberIsNegativeException extends Exception {
	public NumberIsNegativeException(String string) {
		super(string);
	}
}

/*
 * class OperatorMismatch extends Exception { public OperatorMismatch(String
 * string) { super(string); } }
 */