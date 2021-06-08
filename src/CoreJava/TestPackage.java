package CoreJava;

import capgemini.Packages.*;

public class TestPackage {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		System.out.println(t1.sum(32));
		System.out.println(t2.sub(156));
		System.out.println(arr.getClass().getName());
	}

}
