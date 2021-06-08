package ComparatorvsComparable;
import java.util.Comparator;
public class CompareByStudentName implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.getSname().compareTo(o2.getSname());
		//for descending order
		//return -o1.getSname().compareTo(o2.getSname());
		
	}

}
