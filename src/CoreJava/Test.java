package CoreJava;

public class Test {
	int Add(int x,int y) {
		return x+y;
	}
	String getFullName(String firstName,String lastName)
	   {
	   
	      return firstName +" "+ lastName;
	   }
	public static void main(String []args) {
		Test t1=new Test();
		System.out.println(t1.Add(5, 20));
		System.out.println(t1.getFullName("Indrajit", "Singh"));
		System.out.println(t1.getClass());
		
	}
}
