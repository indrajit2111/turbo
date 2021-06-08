package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1<i2)
		{
			return 9;
		}
		else if(i1>i2)
		{
			return -9;
		}
		else
		{
			return 0;
		}
		
	}
	
}
public class Test4 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(20);
		
		//with comparator
		System.out.println("before sorting: " + l);
		Collections.sort(l,new MyComparator());
		System.out.println("after sorting: " + l);
		
		//without comparator using lambda expression
		System.out.println("before sorting: " + l);
		Collections.sort(l,(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);
		System.out.println("after sorting: " + l);
		
	}

}

