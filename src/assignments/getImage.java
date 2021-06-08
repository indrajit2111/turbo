package assignments;
import java.util.*;
public class getImage{

     public static void main(String []args){
        String s="HELLO";
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb1=new StringBuffer();
        sb=sb.reverse();
        sb1.append(s+"|");
        sb1.append(sb);
        System.out.println(sb1.toString());
     }
}
