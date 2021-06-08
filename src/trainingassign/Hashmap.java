package trainingassign;
import java.util.*;

class Employee{
	private int empid;
	private String ename;
	public Employee(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "[empid=" + empid + ", ename=" + ename + "]";
	}
	
	
}

public class Hashmap {
	
	public static void main(String[] args) {
		Employee e1= new Employee(101,"Ind");
		Employee e2= new Employee(101,"Tom");
		HashMap<Employee,String> hm=new HashMap();
		hm.put(e1,"Pass");
		hm.put(e2,"Fail");
		Set<Map.Entry<Employee, String>> emp=hm.entrySet();
		for(Map.Entry<Employee, String>rec:emp) {
			System.out.println(rec.getKey()+"/"+rec.getValue());
		}
	}

}
