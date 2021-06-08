package streamapi;

import java.util.*;

public class Test5 {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(20);
		l.add(45);
		l.add(5);
		l.add(56);
		l.add(78);
		l.add(345);

		System.out.println("using for each loop");
		for (Integer i : l) {
			System.out.println(i);
		}

		System.out.println("using stream interface foreach loop");
		l.stream().forEach(i -> System.out.println(i));
		System.out.println("using stream interface foreach loop with method referencing");
		l.stream().forEach(System.out::println);

	}

}
