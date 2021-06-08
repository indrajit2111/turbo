package lambdaexpression;

interface i3{
	public String m1(String s); 
}
public class Lab9_2{
	
	public static void main(String[] args) {
		String s2="CG";
		i3 i=(s)->{
			char[] c=s.toCharArray();
			StringBuffer s1= new StringBuffer();
			for(char a:c) {
				s1.append(a);
				s1.append(" ");
			}s1.deleteCharAt(s1.length()-1);
			return s1.toString();
		};
		System.out.println(i.m1(s2));
	}
	

}
