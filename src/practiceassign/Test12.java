package practiceassign;

import java.util.ArrayList;
import java.util.Arrays;

public class Test12 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("amit#12#12#12","deepak#13#12#12"));
		String[] a=new String[al.size()];
		a=al.toArray(a);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<String> al2=new ArrayList<String>();
		int sum1 = 0;
		String[] b1 = a[1].split("#");
		for (int i = 1; i < b1.length; i++) {
			sum1 += Integer.parseInt(b1[i]);
			
		}
		int sum = 0;
		String[] b = a[0].split("#");
		for (int i = 1; i < b.length; i++) {
			sum += Integer.parseInt(b[i]);
			
		}
		al1.add(sum1);
		al2.add(b1[0]);
		al1.add(sum);
		al2.add(b[0]);
			
		if(al1.get(0)>al1.get(1)) {
			System.out.println(al2.get(0));
		}else {
			System.out.println(al2.get(1));
		}
		 
}
}
