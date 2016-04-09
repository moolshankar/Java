
public class Student {
	private String name = null;
	private int rollNo = 0;
	private String standard = null;
	private String phone = null;
	private String city = null;
	
	public Student (String name, int rollno, String std, String ph, String city){
		this.name = name;
		this.rollNo = rollno;
		this.standard = std;
		this.phone = ph;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
