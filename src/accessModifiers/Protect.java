package accessModifiers;

public class Protect {
	//protected properties
		protected int x=100;
		protected void display()
		{
			System.out.println("protected value of x: " + x);
			
		}
		public static void main(String[] args)
		{
			Protect obj = new Protect();
			System.out.println(obj.x);
			System.out.println("=================");
			obj.display();
		}

}
