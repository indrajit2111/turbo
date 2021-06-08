package interfaces;
interface Left
{
	default void m1()
	{
		System.out.println("left default method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("right default method");
	}
}

public class Test2 implements Left,Right{
	
		public void m1() {
			//calling right interface m1()
			//Right.super.m1();
			//calling left interface m1()
			//Left.super.m1();
			System.out.println("default method");
		}
		
		public static void main(String[] args) {
			Test2 t=new Test2();
			t.m1();
		}

}
