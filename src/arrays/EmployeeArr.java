package arrays;

class Employee
{
	int empid;
	String empname;
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public String toString()
	{
		return empid + " " + empname;
	}
}
public class EmployeeArr {
		public static void main(String[] args) {
			
			Employee e1=  new Employee(100,"Indrajit");
			Employee e2 = new Employee(101,"Ram");
			Employee e3 = new Employee(102,"Shyam");
			
			Employee emp[]= {e1,e2,e3};
			
			for(Employee e: emp)
			{
				System.out.println(e);
			}
			
			
		}

}
