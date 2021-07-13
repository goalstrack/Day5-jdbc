package EmployeeApplication;

public class SalesEmployee extends Employee {
	int incentives;
	public SalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(String employeeName, int employeeId, int employeeSalary, Project project) {
		super(employeeName, employeeId, employeeSalary, project);
		// TODO Auto-generated constructor stub
	}
     
	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}
	public void setSalary()
	{
		int a=this.getEmployeeSalary();
		this.setEmployeeSalary( a+incentives);
	}

	@Override
	public void loginLogoff() {
		System.out.println("login-Logoff is Void ");
	}
	
	
	public void doMarketing(String product)
	{
		System.out.println(" Doing Marketing of "+product);
	}
}