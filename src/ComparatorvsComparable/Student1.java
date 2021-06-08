package ComparatorvsComparable;

public class Student1 implements Comparable<Student1> {
	private int stid;
	private String sname;

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", sname=" + sname + "]";
	}

	public Student1(int stid, String sname) {
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
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.getSname().compareTo(o.getSname());
	
	}

}
