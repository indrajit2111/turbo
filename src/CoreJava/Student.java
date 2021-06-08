package CoreJava;

public class Student {
	int i = 100;
	String s = "IS";
	static String college="BIT";

	void getString() {
		System.out.println("Val:" + i);
		System.out.println("Name:" + s);
	}
	int getAge() {
		return 90;
	}
	char getStudentGrade() {
		return 'O';
	}
	boolean isStudentActive() {
		return true;
	}

	void getStudentInfo(String stname , int stid)
	  {
	    System.out.println("student name is " + stname);
		System.out.println("Student id is " + stid);
	  }
	public static void main(String[] args) {
		Student is = new Student();
		is.getString();
		System.out.println("Age is : "+is.getAge());
		System.out.println(is.getStudentGrade());
		System.out.println(is.isStudentActive());
		is.getStudentInfo("Student", 38);
		System.out.println(Student.college);
	}
	
}
