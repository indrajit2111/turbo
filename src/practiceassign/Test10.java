package practiceassign;

import java.util.*;

public class Test10 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] arr1= {3,4,5,6};
		int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr1[j]) {
					al.add(arr[i]);
				}
			}
		}
		Integer[] arr2=new Integer[al.size()];
		arr2=al.toArray(arr2);
		for(Integer a:arr2) {
			sum+=a;
		}
		System.out.println(sum);
		
		
	}

}
