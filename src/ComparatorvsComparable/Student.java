package ComparatorvsComparable;

public class Student implements Comparable<Student> {
	private int stid;
	private String sname;

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", sname=" + sname + "]";
	}

	public Student(int stid, String sname) {
		super();
		this.stid = stid;
		this.sname = sname;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.stid > o.stid)
		{
			return 9;
		}
		else if(this.stid < o.stid)
		{
			return -9;
		}
		else
		{
			return 0;
		}
	
	}

}
