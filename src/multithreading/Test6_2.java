package multithreading;



class Table1
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

class MyThread11 extends Thread
{
	//association
	Table t;
	//parameterized constructor
	MyThread11(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
	    t.printTable(5);
	}
	
	
}


//execution logic class
public class Test6_2 {
	
	public static void main(String[] args) {
		Table obj = new Table();
		MyThread11 t1 = new MyThread11(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
		
		
	}

}
