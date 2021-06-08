package multithreading;

public class Test3 extends Thread {

	public void run()
	{
		
		for(int i=1;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			
			  try { Thread.sleep(500); } catch (InterruptedException e) { 
				  // TODOAuto-generated catch block 
				  e.printStackTrace(); }
			 
		}
	}

	public static void main(String[] args) {

		Test3 t1 = new Test3();
		Test3 t2 = new Test3();

		t1.start();

		t2.start();

	}

}
