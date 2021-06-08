package multithreading;

public class Test4 extends Thread {
	
	
	public void run()
	{
		
		System.out.println("running thread name is " + 
		Thread.currentThread().getName() + " and it's priority value is : " 
				
		+ Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		
		Test4 t1 = new Test4();
		
		t1.setName("Indrajit");
		
		Test4 t2 = new Test4();
		
		t2.setName("Singh");
		
		
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(4);
	    //t2.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(7);
	    
	    
	    t1.start();
	    t2.start();
	    
	    
	}

}