package accessModifiers;

public class pvt {
	private int x=100;
	private void display()
	{
		System.out.println("private value of x: " + x);
		
	}

	public static void main(String[] args)
	{
		pvt obj = new pvt();
		System.out.println(obj.x);
		System.out.println("=================");
		obj.display();
	}

}
