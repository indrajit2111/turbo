package streamapi;
import java.util.stream.Stream;
public class Test7 {
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        // Creating an Stream with the help of Stream.of(T values......) function
	        Stream<String> stream = Stream.of("Indrajit", "Singh", "Kolkata");
	  
	        // Displaying the sequential ordered stream
	        stream.forEach(System.out::println);
	    }
}


