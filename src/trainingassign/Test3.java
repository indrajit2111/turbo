package trainingassign;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(1,2,3,5));
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(Integer a:al) {
			for(Integer b:al1) {
				if(a.equals(b)) {
					continue;
				}else {
					al2.add(a);
				}
			}
		}
		for(Integer b:al1) {
			for(Integer a:al) {
				if(b.equals(a)) {
					continue;
				}else {
					al2.add(b);
				}
			}
		}
		for(Integer c:al2) {
			System.out.println(c);
		}
		
	}

}
