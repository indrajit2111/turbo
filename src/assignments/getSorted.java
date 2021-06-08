package assignments;
import java.util.*;
public class getSorted {
	 public static void main(String []args){
	        int[] a={12,34,57,33,455,567};
	        for(int i=0;i<a.length;i++){
	            int sum=0,k=0;
	            while(a[i]>0){
	                k=a[i]%10;
	                sum=(sum*10)+k;
	                a[i]=a[i]/10;
	            }a[i]=sum;
	        }
	        Arrays.sort(a);
	        for(int l:a){
	            System.out.println(l);
	        }
	     }

}
