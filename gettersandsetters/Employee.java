/**
 * @author Ryan Bond 
 * https://github.com/ozone227 - drbond@gmail.com
 */
public class Employee {
	/**
	 * Create Employee Fields
	 */
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	private double balance;

	public Employee(String firstName, String lastName, int employeeID, double salary, double balance) {

		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		setSalary(salary);
		setBalance(balance);
	}
	// Create Setters
	public void setFirstName(String first){
		this.firstName=first;
	}

	public void setLastName(String last){
		this.lastName=last;
	}

	public void setEmployeeID(int employeeID){
		this.employeeID=employeeID;
	}

	public void setSalary(double salary){
		this.salary=salary;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}

	// Create Getters
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getEmployeeID(){
		return employeeID;
	}
	public double getSalary(){
		return salary;
	}
	public double getBalance(){
		return balance;
	}
	// Print Attributes With
	public void EmployeeSummary (){
		System.out.println(getFirstName()+ " " +getLastName()+ " " +getEmployeeID()+ " " +getSalary()+ " " +getBalance());
	}
}
