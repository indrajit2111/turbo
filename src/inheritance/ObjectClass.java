package inheritance;

public class ObjectClass {
	
	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		System.out.println(obj1.getClass().getName());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.toString());
	}

}
