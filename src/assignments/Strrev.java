package assignments;

public class Strrev {
	public static void main(String []args){
	     int[] arr={1,2,3};
	        String s="";
	        for(int j:arr){
	            s+=Integer.toString(j);
	        }
	        String r = new StringBuffer(s).reverse().toString();
	        char[] c=r.toCharArray();
	        int[] arr1= new int[c.length];
	        for(int k=0;k<s.length();k++){
	            arr1[k] = Integer.parseInt(String.valueOf(c[k]));
	        }
	        for(int m:arr1){
	            System.out.print(m);
	        }
	     }

}
