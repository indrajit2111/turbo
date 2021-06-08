package assignments;

public class Sqdiff{

	public static void main(String []args){
		int n=10,i,sq=0,sum=0;
		for(i=1;i<=n;i++){
			sq+=i*i;
			sum+=i;
		}
		sum=sum*sum;
		int result=sq-sum;
		System.out.println("result is: "+sq);
		System.out.println("result is: "+sum);
		System.out.println("result is: "+result);
		
		
	}
}


