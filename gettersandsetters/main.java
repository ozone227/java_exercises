/**
 * @author Ryan Bond - donnie.bond@csuglobal.edu
 * https://github.com/ozone227 - drbond@gmail.com
 * Week 1 - Critical Thinking
 *
 *
 */

public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager1=new Manager("Chet", "Farkington", 1001,100000.0,20000.0, "Information Technology");
		Manager manager2=new Manager("Tits", "McGee", 1002, 100100.0, 25000.0,"Human Resources");
		manager1.EmployeeSummary();
		manager2.EmployeeSummary();
	}

}
