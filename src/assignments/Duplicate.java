package assignments;
import java.util.*;
public class Duplicate{
     public static void main(String []args){
        int[] array = {1,2,11,2,1,3,45,3,24};
        Set<Integer> set = new HashSet<>();
        for(int i:array){
            set.add(i);
        }
        Integer[] arr = new Integer[set.size()];
        int[] arr1 = new int[set.size()];
		int[] arr2 = new int[set.size()];
        set.toArray(arr);
        for(int k=0;k<arr1.length;k++){
            arr1[k]=(int)(arr[k]);
        }
        Arrays.sort(arr1);
		int n=arr1.length;
		int j=0;
		for(int m=n-1;m>=0;m--){
			arr2[j++]=arr1[m];
			}
		for(int l:arr2){
            System.out.println(l);
        }
     }
}