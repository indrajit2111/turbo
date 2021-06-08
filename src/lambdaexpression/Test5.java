package lambdaexpression;

import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		t.add(10);
		t.add(23);
		t.add(1);
		t.add(35);
		t.add(15);
		System.out.println(t);
		
		TreeSet<Integer> t1=new TreeSet<Integer>((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);
		t1.add(10);
		t1.add(23);
		t1.add(1);
		t1.add(35);
		t1.add(15);
		System.out.println(t1);
	}
	
}

