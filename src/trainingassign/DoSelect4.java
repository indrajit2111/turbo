package trainingassign;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email{
	// Implement Email Class according to the specifiaction.
	public Header header;
	public String body;
	public String greetings;
	public Email(Header header, String body, String greetings) {
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
	}
	class Header{
	// Implemet the Header Class according to the specifiaction.
		public String from;
		public String to;
		public Header(String from, String to) {
			this.from = from;
			this.to = to;
		}
		
	}


	class EmailOperations{
	// Implemet the Three methods specified in the specified.
		public int emailVerify(Email e) {
			String regex="(^[A-Za-z+_.-]+@(.+)$)";
			Pattern pattern=Pattern.compile(regex);
			Matcher m=pattern.matcher(e.header.from);
			Matcher m1=pattern.matcher(e.header.to);
			if(m.matches()&&m1.matches()) {
				return 2;
			}else if(m.matches()||m1.matches()){
				return 1;
			}else {
				return 0;
			}	
		}
		public String bodyEncryption (Email e) {
			StringBuffer result= new StringBuffer();
			 
	        for (int i=0; i<e.body.length(); i++)
	        {
	            if (Character.isUpperCase(e.body.charAt(i)))
	            {
	                char ch = (char)(((int)e.body.charAt(i) +
	                                  3 - 65) % 26 + 65);
	                result.append(ch);
	            }
	            else if(Character.isLowerCase(e.body.charAt(i)))
	            {
	                char ch = (char)(((int)e.body.charAt(i) +
	                                  3 - 97) % 26 + 97);
	                result.append(ch);
	            }
				else if(e.body.charAt(i) == ' '){
					result.append(' ');
					
				}
	        }
	        return result.toString();
			
		}
		public String greetingMessage (Email e) {
			return e.greetings+" "+e.header.from.substring(0,e.header.from.indexOf('@') );
			
		}
	}
public class DoSelect4 {

	

}
