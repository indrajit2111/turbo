package CoreJava;

public class Constructor {
	//own default consturctor
		 public Constructor()
		 {
			this(100);
			System.out.println("Iam default constructor");
		 }
		 //defining single parameterized constructor
		 
		 public Constructor(int x)
		 {
			 //call  default constructor
			 this(200,20);
			 System.out.println("iam from single parameterized constructor");
			
		 }
		 
		 //defining double parameterized constructor
		 public Constructor(int x, int y)
		 {
			 //call single parameterized constructor
			 
			 
			 System.out.println("iam from double parameterized constructor");
		 }
		 
		 public static void main(String[] args)
		 {
			 
			 //create the object using double parameterized constructor
			 
			 Constructor obj = new Constructor();
			 obj.toString();
			 
		
		 }

}
