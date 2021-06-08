package lambdaexpression;
interface i4{
	public boolean m1(String s,String s1);
}

public class Lab9_3 {
	public static void main(String[] args) {
		i4 i=(a,b)->{return (a.equals("Indrajit") && b.equals("Password"));}; 
		String s="Indrajit";
		String s1="Password";
		System.out.println(i.m1(s, s1));
			
	}

}
