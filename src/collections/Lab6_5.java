package collections;

import java.util.*;

public class Lab6_5 {
	public static void main(String[] args) {
		int[] arr= {34,65,3,16,78,45};
		ArrayList<Integer> l=new ArrayList<Integer>(); 
		for(int a:arr) {
			l.add(a);
		}
		Collections.sort(l);
		System.out.println(l.get(1));
	}

}
