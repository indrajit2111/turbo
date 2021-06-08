package strings;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		StudentEqualsvsHash st=new StudentEqualsvsHash(101, "Indrajit");
		StudentEqualsvsHash st1=new StudentEqualsvsHash(101, "Indrajit");
		
		System.out.println(st1.hashCode());
		System.out.println(st.hashCode());
		HashSet<StudentEqualsvsHash> studentSet = new HashSet<StudentEqualsvsHash>();
		studentSet.add(st1);
		studentSet.add(st);
		for(StudentEqualsvsHash student:studentSet)
		{
			System.out.println("id: " + student.getStid() + " Name: " + student.getStname());
		}
		/*
		 * ArrayList<StudentEqualsvsHash> studentSet1 = new
		 * ArrayList<StudentEqualsvsHash>(); for(StudentEqualsvsHash
		 * student:studentSet1) { System.out.println("id: " + student.getStid() +
		 * " Name: " + student.getStname()); }
		 */
		
		
			
		}

		
	
}
