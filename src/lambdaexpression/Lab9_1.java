package lambdaexpression;

interface Inter1{
	public int m1(int x,int y);
}

public class Lab9_1 {
	public static void main(String[] args) {
		Inter1 i1=(x,y)->{ int pow=1;
			for(int i=0;i<y;i++) {
				pow*=x;
			}
			return pow;
		};
		System.out.println(i1.m1(5,3));
	}
	

}

