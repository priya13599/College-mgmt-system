package Bean;

import java.util.Date;

public class FacultyBean {

	private String faculty_name;
	private String email_id;
	private Date DOB;
	private String Gender;
	private String Address;
	private String Designation;
	private String Salary;
	private String Phone_number;
	private String Department_id;
	private String Department;
	private Date DOJ;
	public FacultyBean(String faculty_name, String email_id, Date dOB, String gender, String address,
			String designation, String salary, String phone_number, String department_id, String department, Date dOJ) {
	
		this.faculty_name = faculty_name;
		this.email_id = email_id;
		this.DOB = dOB;
		this.Gender = gender;
		this.Address = address;
		this.Designation = designation;
		this.Salary = salary;
		this.Phone_number = phone_number;
		this.Department_id = department_id;
		this.Department = department;
		this.DOJ = dOJ;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
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
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	@Override
	public String toString() {
		return "FacultyBean [faculty_name=" + faculty_name + ", email_id=" + email_id + ", DOB=" + DOB + ", Gender="
				+ Gender + ", Address=" + Address + ", Designation=" + Designation + ", Salary=" + Salary
				+ ", Phone_number=" + Phone_number + ", Department_id=" + Department_id + ", Department=" + Department
				+ ", DOJ=" + DOJ + "]";
	}
	
	
	
	
	
}
