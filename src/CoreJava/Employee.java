package CoreJava;

public class Employee {
	
	String getEmployeeName() {
		return "Indrajit Singh";
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Name is: "+emp.getEmployeeName());
		
	}

}
