package trainingassign;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	public static void main(String[] args) {
		String s="9999999999";
		/*
		 * String r="[0-9]"; String r1="[^a-zA-Z0-9]"; String r2="[a-zA-Z]";
		 */
		Pattern p1=Pattern.compile("[6789][0-9]{9}");
		Matcher m=p1.matcher(s);
		/*
		 * Pattern p2=Pattern.compile("[^a-zA-Z0-9]"); Matcher m2=p2.matcher(s); Pattern
		 * p3=Pattern.compile("[a-zA-Z]"); Matcher m3=p3.matcher(s);
		 */
		if(m.matches()) {
			System.out.println("true");
			//System.out.println(m.start() + "..."+ m.end() + "..." + m.group());
		}else {
			System.out.println("false");
		}
		
		
		
	}

}
