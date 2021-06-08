package typeCasting;

public class Cast1 {
	public static void main(String[] args) {

		/*// Widening type casting
		int x = 7;
		// automatically converts the integer type into long type
		long y = x; // automatically converts the long type into float type
		float z = y;
		System.out.println("before conversion int value: " + x);
		System.out.println("after conversion long value: " + y);
		System.out.println("after conversion float value: " + z);
		*/
		
		// Narrowing type casting
		double d = 1656.434;
		// converting double datatype into long datatype
		long l = (long) d;
		// converting long datatype into int datatype
		int i = (int) l;
		System.out.println("before conversin double value: " + d);
		System.out.println("after conversion into long type: " + l);
		System.out.println("after conversion into int type: " + i);
	}

}
