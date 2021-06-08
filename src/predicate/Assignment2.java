package predicate;

import java.util.function.Predicate;

public class Assignment2 {
	public static void main(String[] args) {
		
		 
		 Predicate<String> p = s -> s.length()>3;
		 
		 System.out.println(p.test("Ashmita Sil"));
		
	}
}
