package labwork3;

public class Employee {
	private String id;
	private String name;
	private String dept;
	private int basicSalary;
	private int extraSalary;
	
	public Employee(String eID, String eName, String eDept, int eBS, int eES) {
		this.id = eID;
		this.name = eName;
		this.dept = eDept;
		this.basicSalary = eBS;
		this.extraSalary = eES;
	}
	
	public void changeEmployeeSalary (int eBS, int eES) {
		this.basicSalary = eBS;
		this.extraSalary = eES;
	}
	
	public int getBasicSalary() {
		return this.basicSalary;
	}
	
	public int getExtraSalary() {
		return this.extraSalary;
	}
	
	public String getEmployeeID() {
		return this.id;
	}
	
	public String getEmployeeName() {
		return this.name;
	}
	
	public String getEmployeeDept() {
		return this.dept;
	}

}
