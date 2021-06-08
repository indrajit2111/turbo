package collections;

import java.util.*;

public class Lab6_7 {
	public static void main(String[] args) {
		int[] arr={34,65,3,16,78,45};
		ArrayList<Integer> li=new ArrayList<Integer>(); 

		for(int a:arr) {
			li.add(a);
		}
		Collections.sort(li);
		Collections.reverse(li);
		System.out.println(li);

	}
}
