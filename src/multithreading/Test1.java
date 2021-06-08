package multithreading;

public class Test1 extends Thread {
	
	public void run()
	{
		//logic will be executed by our own thread
		System.out.println("child thread: " + Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		//logic will be executed by main thread
		
		System.out.println("main thread: " + Thread.currentThread().getName());
		
		Test1 t1  = new Test1();
		t1.setName("capgemini");
		
		t1.start();
		
		}
}