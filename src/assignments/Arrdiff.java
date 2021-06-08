package assignments;

public class Arrdiff{

    public static void main(String []args){
       int a=231456;
       int sum=0,l=0;
       String s=Integer.toString(a);
       char[] c=s.toCharArray();
       int[] b=new int[c.length];
       for(int i=0;i<c.length;i++){
           b[i]=Character.getNumericValue(c[i]);
       }
       for(int k=0;k<b.length-1;k++){
           sum=b[k]-b[k+1];
           l=(sum<0)?-sum:sum;
           b[k]=l;
       }
       for(int d:b){
           System.out.println(d);
       }
    }
}
