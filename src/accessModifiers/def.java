package accessModifiers;

public class def {

	//default properties
		int x=100;
		void display()
		{
			System.out.println("default value of x: " + x);
			
		}

		public static void main(String[] args)
		{
			def obj = new def();
			System.out.println(obj.x);
			System.out.println("=================");
			obj.display();
		}
}
