package interfaces;

interface interf1
{
	default void m1()
	{
		System.out.println("default method");
	}
}
public class Test1 implements interf1
{
	@Override
    public void m1()
	{	interf1.super.m1();
		System.out.println("default method-imp class");
	}
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m1();
		
	}

}