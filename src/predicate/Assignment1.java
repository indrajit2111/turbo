package predicate;

import java.util.TreeSet;

public class Assignment1 {
public static void main(String[] args) {
		
		
	TreeSet<Integer> ts = new TreeSet<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);;
	ts.add(76);
	ts.add(34);
	ts.add(23);
	ts.add(45);
	
	System.out.println(ts);
	}
}

