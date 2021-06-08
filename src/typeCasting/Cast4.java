package typeCasting;
//upcasting
class Parent
{
	 void printData()
	 {
		 System.out.println("method of parent class");
	 }
	
}

class Child  extends Parent
{
	 void printData()
	 {
		 System.out.println("method of child class");
	 }
	
}
//execution logic class
public class Cast4 {
	public static void main(String[] args) {
		
		 Parent p = new Parent();
		 Child c = new Child();
		 p.toString();
		 c.toString();
		 
		 //converting child object to parent object - upcasting
		 Parent p1=new Child();
		 
		 p1.printData();
		 
		 //converting parent object to child object - downcasting (manually by the programmer)
		 Child c1=(Child)new Parent();
		 
		 c1.printData();
	
		 /*
		 Integer x = 100;
		 //upcasting
		 
		 Object y = x;
		 //downcasting
		 Integer z = (Integer)y;
		 */
	
		 
		 
		 
		 
	}
}
