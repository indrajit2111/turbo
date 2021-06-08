package collections;
import java.util.*;

public class Lab6_2 {
	public static void main(String[] args) {
		String s="Indrajit";
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		for(char a:c) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}else {
				hm.put(a,1);
			}
		}
		System.out.println(hm);
	}
	

}
