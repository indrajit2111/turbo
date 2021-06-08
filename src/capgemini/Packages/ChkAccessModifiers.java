package capgemini.Packages;

import accessModifiers.Protect;

public class ChkAccessModifiers extends Protect {

	public static void main(String[] args) {
		/*
		 * 
		 * invalid: default propertes can't access from someother package classesdef obj
		 * = new def(); System.out.println(obj.x);
		 * System.out.println("================="); obj.display();
		 */
		
		// other package sub class
		ChkAccessModifiers obj = new ChkAccessModifiers();
		System.out.println(obj.x);
		System.out.println("================");
		obj.display();
	}
}
