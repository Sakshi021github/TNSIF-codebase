package singleinheritance;

public class Student  extends Citizen{
	
	//data member
	//private String studentname;
	//private String address;
	//private long phoneno;
	private int rollno;
	private String collegename;
	
	public Student() {
		super();
	}
	
	
    //para constrictor
	public Student(String name, String adharNo, String address, long phone,int rollno, String collegename) {
		super(name, adharNo, address, phone );
		this.rollno = rollno;
		this.collegename = collegename;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

    //we have access members of parent and student 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	
	

}
