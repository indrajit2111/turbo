package assignments;
import java.util.*;
public class alterString{
     public static void main(String []args){
        String s="JAVA";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='a' ||c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u' ||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
				continue;
			}else{
			    c[i]=(char)((int)c[i]+1);
			}
		}
		for(char m:c){
            System.out.print(m);
        }
     }
}
