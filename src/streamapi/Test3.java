package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Ind");
		l.add("Indra");
		l.add("In");
		l.add("Indr");
		l.add("singh");
		l.add("capgemini");
		
		System.out.println(l);
		
	  List<String> l3 = l.stream().sorted().collect(Collectors.toList());
	  System.out.println("according to default natural sorting order: ");
	  System.out.println(l3);

	  List<String> l4 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
	  System.out.println("according to customized sorting order: ");
	  System.out.println(l4);
	}
}


