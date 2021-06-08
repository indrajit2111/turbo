package streamapi;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(20);
		l.add(45);
		l.add(5);
		l.add(56);
		l.add(78);
		l.add(345);

		System.out.println(l);
		Integer l3 = l.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("minimum value is " + l3);

		Integer l4 = l.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println("maximum value is " + l4);

	}

}
