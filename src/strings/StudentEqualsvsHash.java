package strings;

public class StudentEqualsvsHash {
	private int stid;
	 private String stname;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public StudentEqualsvsHash(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stid;
		result = prime * result + ((stname == null) ? 0 : stname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentEqualsvsHash other = (StudentEqualsvsHash) obj;
		if (stid != other.stid)
			return false;
		if (stname == null) {
			if (other.stname != null)
				return false;
		} else if (!stname.equals(other.stname))
			return false;
		return true;
	}
	 

}
