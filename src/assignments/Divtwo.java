package assignments;

public class Divtwo {
	public static boolean CheckNumber(int i){
        double k=i;
        while(k>1){
            k=k/2;
        }if(k==1){
            return true;
        }else{
            return false;
        }
	}
	public static void main(String[] args){
		int i=8;
		System.out.println(CheckNumber(i));
	}

}
