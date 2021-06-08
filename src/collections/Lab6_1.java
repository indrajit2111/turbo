package collections;
import java.util.*;

public class Lab6_1 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(101,123);
		hm.put(102, 1243);
		hm.put(103,154);
		TreeSet<Integer> s=new TreeSet<Integer>(); 
		for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
			s.add(e.getValue());
		}
		ArrayList<Integer> l= new ArrayList<Integer>(s);
		System.out.println(l);
		
	}
	

}
