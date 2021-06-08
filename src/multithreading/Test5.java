package multithreading;

public class Test5 extends Thread{
	
	public void run()
	{
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread is running");
		}
		else
		{
			System.out.println("user thread is running");
		}
	}
	public static void main(String[] args) {
		
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		Test5 t3 = new Test5();
		
		t1.setDaemon(true);
		t1.start();
		
		
		//t2.setDaemon(true);
		t2.start();
		t3.start();
		
	}

}
