package ComparatorvsComparable;
import java.util.*;

public class WithoutComparatorvsComparable {
	public static void main(String[] args) {
	
		
		String[] cityNames= {"hyd","che","kol","pune"};
		Arrays.sort(cityNames);
		System.out.println(Arrays.toString(cityNames));
		
		int[] rankings = {4,1,5,3,2};
		Arrays.sort(rankings);
		System.out.println(Arrays.toString(rankings));
	
	    List<String> countries = new ArrayList<String>();
	    countries.add("india");
	    countries.add("australia");
	    countries.add("britan");
	    countries.add("mexico");
	    
	    Collections.sort(countries);
	    
	    for(String s:countries)
	    {
	    	System.out.println(s);
	    }
	
	}




}
