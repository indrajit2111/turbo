package lambdaexpression;
@FunctionalInterface
interface Inter{
	public abstract int sq(int a);
}

public class Test2 {
	public static void main(String[] args) {
		Inter i=(a)->a*a;
		System.out.println(i.sq(24));
	}
}
