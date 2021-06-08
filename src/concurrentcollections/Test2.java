package concurrentcollections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test2 extends Thread{
	static ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>();
	
	public void run()
	{
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating map");
		m.put(103, "C");
		m.put(104, "D");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		m.put(101, "A");
		m.put(102, "B");
		
		Test2 t = new Test2();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i1 = (Integer)itr.next();
			
			System.out.println("main thread iterating and current entry is : " +i1 + "....." + m.get(i1) );
			
			Thread.sleep(2000);
		}
		
		System.out.println(m);
	}

}
