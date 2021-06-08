package practiceassign;

import java.util.*;

public class Test19 {
	public static void main(String[] args) {
		String[] s={"2AA","12","ABC","c1a"};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(String b:s)
		for(String a:b.split("")) {
			if(a.matches("[0-9]")) {
				al.add(Integer.parseInt(a));
			}
			
		}
		int sum=0;
		for(Integer m:al) {
			sum+=m;
		}
		System.out.println(sum);
	}

}
