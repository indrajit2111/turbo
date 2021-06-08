package assignments;

public class Positivenum {
	public static boolean CheckNumber(int i){
		 String s=Integer.toString(i);
	        char[] c=s.toCharArray();
	        int min= c[0];
			for(int k=1;k<c.length;k++){
				if(min<=c[k]){
				    min=c[k];
				}else{
				    break;
				}
			}if(min==c[c.length-1]){
			    return true;
			}else{
			    return false;
			}
		}
		public static void main(String[] args){
			int i=1334468;
			System.out.println(CheckNumber(i));
		}

}
