package multithreading;



class Table
{
	 synchronized void printTable(int n)
	 {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(n*i);
			 try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	
}
class MyThread1 extends Thread
{
	//association
	Table t;
	//parameterized constructor
	MyThread1(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
	}
	
	
}



class MyThread2 extends Thread
{
	Table t;
	//parameterized constructor
		MyThread2(Table t)
		{
			this.t=t;
		}
		
		public void run()
		{
		    t.printTable(100);
		}
	
}
//execution logic class
public class Test6_1 {
	
	public static void main(String[] args) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj){
			
			public void run()
			{
			    
				t.printTable(100);
			}
		};
		MyThread1 t2 = new MyThread1(obj) {
			public void run()
			{
			    
				t.printTable(1);
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}

