package predicate;

import java.util.function.Predicate;

public class Test1 {
	
	 public static void main(String[] args) {
		
		 
		 Predicate<Integer> p = i -> i>10;
		 
		 System.out.println(p.test(78));
		 System.out.println(p.test(7));
	}

}