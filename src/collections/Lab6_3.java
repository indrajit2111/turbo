package collections;
import java.util.*;

public class Lab6_3 {
	public static void main(String[] args) {
		int[] arr= {2,4,6,2,5,7,8,29};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr) {
			hm.put(i,i*i);
		}
		System.out.println(hm);
		
	}

}
