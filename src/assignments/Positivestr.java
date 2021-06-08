package assignments;

public class Positivestr{

	public static boolean CheckNumber(String s){
        char[] c=s.toCharArray();
        char min= c[0];
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
		String i="Ant";
		System.out.println(CheckNumber(i));
	}

}