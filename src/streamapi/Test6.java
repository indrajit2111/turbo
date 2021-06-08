package streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test6 {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(20);
		l.add(45);
		l.add(5);
		l.add(56);
		l.add(78);
		l.add(345);
		
		//Limiting function-> limit()
		Stream<Integer> s=l.stream().limit(3);
		s.forEach(System.out::println);
		System.out.println("``````````````````````````````````````````````");
		//Converting to Object array-> toArray()
		Object[] arr=l.toArray();
		for(Object o:arr) {
			System.out.println(o);
		}

	}
}
