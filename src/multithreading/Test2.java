package multithreading;

public class Test2 implements Runnable{
	
	public void run()
	{
		System.out.println("child thread : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		
		Runnable obj = new Test2();
		Thread t = new Thread(obj);
	    t.start();
	    
	    Thread t1 = new Thread(obj);
	    t1.start();
		
	}

}