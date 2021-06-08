package practiceassign;

public class Test5 {
	public static void main(String[] args) {
		String s="Hello*orld";
		if(s.contains("*")) {
			if(s.substring(s.indexOf('*')-1, s.indexOf('*')).equalsIgnoreCase(s.substring(s.indexOf('*')+1, s.indexOf('*')+2))) {
				System.out.println(true);
				
			}else {
				System.out.println(false);	
			}
		}else {
			System.out.println(false);
		}
	}

}
