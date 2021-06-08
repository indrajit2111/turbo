package ComparatorvsComparable;
import java.util.Comparator;

public class CompareByStudentId implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		
		if(o1.getStid() > o2.getStid())
		{
			return 9;
		}
		else if (o1.getStid()<o2.getStid())
		{
			return -9;
		}
		else
		{
			return 0;
		}
	}

	

}