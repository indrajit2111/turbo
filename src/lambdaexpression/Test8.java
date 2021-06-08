package lambdaexpression;

class Employee {
	
	int empid;
	String empnae;
	public Employee(int empid, String empnae) {
		super();
		this.empid = empid;
		this.empnae = empnae;
	}
	@Override
	public String toString() {
		return empid + " " + empnae;
	}

}

public class Test8{
	
}
