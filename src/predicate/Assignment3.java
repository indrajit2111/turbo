package predicate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment3 {
public static void main(String[]args)
{
	ArrayList<Integer> l = new ArrayList<Integer>();
		/*
		 * l.add(10); l.add(0); l.add(5); l.add(20);
		 */
	Predicate<ArrayList> b = i -> l.isEmpty();
	System.out.println(b.test(l));
}
}
