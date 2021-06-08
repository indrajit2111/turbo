package interfaces;

interface i1
{
	public static void sum(int a, int b)
	{
		System.out.println("the sum: " + (a+b));
	}
}
public class Test3 implements i1 
{
	public static void main(String[] args) {
		
		
		Test3 obj= new Test3();
		//compile time error: 
		//obj.sum(4,4);
		
		i1.sum(3, 4);
		
	}

}
