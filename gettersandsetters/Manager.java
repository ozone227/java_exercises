/**
 * @author Ryan Bond
 * https://github.com/ozone227 - drbond@gmail.com
 */
public class Manager extends Employee {

	String Department;

	public Manager(String firstName, String lastName, int employeeID, double salary, double balance, String Department) {
		super(firstName, lastName, employeeID, salary, balance);
		this.Department= Department;
	}
// Print Employee's Department
	public void EmployeeSummary() {
		super.EmployeeSummary();
		System.out.println("Department:"+ " " +Department);

	}
}
