package Bean;

import java.util.Date;

public class StudentBean {
	private String Student_name;
	private String Father_name;
	private String email_id;
	private Date DOB;
	private String Gender;
	private String Address;
	private String Admission_no;
	private String Phone_number;
	private Date DOA;
	private String Branch;
	private String Course;
	private String Semester;
	private String Year;
	public StudentBean(String student_name, String father_name, String email_id, Date dOB, String gender,
			String address, String admission_no, String phone_number, Date dOA, String branch, String course,
			String semester, String year) {
		
		this.Student_name = student_name;
		this.Father_name = father_name;
		this.email_id = email_id;
		this.DOB = dOB;
		this.Gender = gender;
		this.Address = address;
		this.Admission_no = admission_no;
		this.Phone_number = phone_number;
		this.DOA = dOA;
		this.Branch = branch;
		this.Course = course;
		this.Semester = semester;
		this.Year = year;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAdmission_no() {
		return Admission_no;
	}
	public void setAdmission_no(String admission_no) {
		Admission_no = admission_no;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	public Date getDOA() {
		return DOA;
	}
	public void setDOA(Date dOA) {
		DOA = dOA;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "StudentBean [Student_name=" + Student_name + ", Father_name=" + Father_name + ", email_id=" + email_id
				+ ", DOB=" + DOB + ", Gender=" + Gender + ", Address=" + Address + ", Admission_no=" + Admission_no
				+ ", Phone_number=" + Phone_number + ", DOA=" + DOA + ", Branch=" + Branch + ", Course=" + Course
				+ ", Semester=" + Semester + ", Year=" + Year + "]";
	}
	
	
}
