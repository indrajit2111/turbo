package multithreading;

class A{
	int count;
	public void add() {
		count++; //601 count=count+1;
	}
}


public class Sync {
	public static void main(String[] args) {
		A a=new A();
		Thread t1=new Thread(new Runnable() {
			public void run(){
				for(int i=0;i<500;i++) {
					a.add();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run(){
				for(int j=0;j<500;j++) {
					a.add();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a.count);
	}

}








