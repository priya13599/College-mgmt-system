package Bean;

public class PlacementReport2016 {

	private String Roll_No;
	private String Name;
	private String Branch;
	private String Company_Name;
	public PlacementReport2016(String roll_No, String name, String branch, String company_Name) {
		
		this.Roll_No = roll_No;
		this.Name = name;
		this.Branch = branch;
		this.Company_Name = company_Name;
	}
	public String getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}
	@Override
	public String toString() {
		return "PlacementReport2016 [Roll_No=" + Roll_No + ", Name=" + Name + ", Branch=" + Branch + ", Company_Name="
				+ Company_Name + "]";
	}
	
}
