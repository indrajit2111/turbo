package exceptions;

public class Test1 {
	public static void main(String[] args) {
		int i=90;
		if(i>100) {
			System.out.println("Product is valid");
		}else {
			try {
				throw new InvalidProductException("Product is invalid");
			}
			catch(InvalidProductException ie) {
				System.out.println(ie);
			}
		}
	}

}
