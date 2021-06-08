package predicate;
import java.util.function.Predicate;

public class Assignment4 {
public static void main(String[]args)
{
	String[] s = {"Indrajit","Ram","Rini","Sam","Rohit","Rishin"};
	
	Predicate<String> p1 = i->i.startsWith("R");
	m1(p1,s);
}
public static void m1(Predicate<String> p,String[] x)
{
	
	for(String x1:x)
	{
		if(p.test(x1))
			System.out.println(x1);
	}

	
}
}

