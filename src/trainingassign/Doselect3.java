package trainingassign;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee1 {
	    public String name;
	    public int salary;
	    public Employee1(String str,int sal)
	    {
	        this.name=str;
	        this.salary=sal;
	    }
	    public String getName()
	    {
	        return this.name;
	    }
	    public void setName(String str)
	    {
	        this.name=str;
	    }
	        public int getSalary()
	    {
	        return this.salary;
	    }
	    public void setSalary(int sal)
	    {
	        this.salary=sal;
	    }
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("<");
	        sb.append("name: ");
	        sb.append(name);
	        sb.append(" salary: ");
	        sb.append("" + salary+">");
	        return sb.toString();

	    }
	}
	class EmployeeInfo{
	    enum SortMethod {BYNAME,BYSALARY}
	    public List<Employee1> sort(List <Employee1> emps, final SortMethod method)
	    {
	        if(method==SortMethod.BYNAME)
	        {
	            Collections.sort(emps,(i1,i2)->(i1.getName().compareTo(i2.getName())));
	            // Collections.sort(emps,(i1,i2)->((i1.getSalary()<i2.getSalary())?-1:(i1.getSalary()>i2.getSalary())?1:0));
	            return emps;
	        }
	        else
	        {
	            Collections.sort(emps,(i1,i2)->(i1.getName().compareTo(i2.getName())));
	             Collections.sort(emps,(i1,i2)->((i1.getSalary()<i2.getSalary())?-1:(i1.getSalary()>i2.getSalary())?1:0));
	             return emps;
	        }
	    }
	    public boolean isCharacterPresentInAllNames(Collection <Employee1> entities, String character)
	    {
	    	if(entities.stream().anyMatch((i)->i.getName().startsWith(character))){
		    	return true;}
	            else if(entities.stream().anyMatch((i)->i.getName().contains(character))){
	                return true;}
		    	else if(entities.stream().noneMatch((i)->i.getName().startsWith(character))) {
		    		return false;
		    	}else 
		    		return true;
	    }
	        
	    }
	        
	    

	
	public class Doselect3 {
}
