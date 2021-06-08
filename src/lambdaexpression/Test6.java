package lambdaexpression;

import java.util.*;
import java.util.TreeMap;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> m = new TreeMap<Integer,String>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		
		m.put(100, "b");
		m.put(600, "s");
		m.put(200, "c");
		m.put(700, "v");
		m.put(400, "p");
		System.out.println(m);
		TreeMap< Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "z");
		map.put(600, "s");
		map.put(200, "c");
		map.put(700, "b");
		map.put(400, "p");
	    List<Map.Entry<Integer,String>> entries = new ArrayList(map.entrySet());
	    Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
	    System.out.println(entries);
	
	}

}