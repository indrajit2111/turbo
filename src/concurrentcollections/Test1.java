package concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>();
		m.put(101, "ram");
		//putIfAbsent(object key,object value)
		/*m.put(101, "ravi");
		System.out.println(m);
		m.putIfAbsent(101, "shiva");*/
		
		//boolean remove(object key,object value)
		/*m.remove(101,"ravi");
		System.out.println(m);
		m.remove(101,"ram");*/
		
		//boolean replace(object key,object old value, object new value)
		m.replace(101, "ravi","shiva");
		System.out.println(m);
		m.replace(101, "ram","shiva");
		
		
		System.out.println(m);
	}

}

