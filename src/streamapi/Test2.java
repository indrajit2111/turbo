package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Ind");
		l.add("In");
		l.add("Indr");
		l.add("Indra");
		System.out.println(l);
		
	    List<String> l2= l.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).collect(Collectors.toList());
	    long cnt=l.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).count();
	    System.out.println(l2);
	    System.out.println("Count for uppercase letters are: "+cnt);
	}

}
