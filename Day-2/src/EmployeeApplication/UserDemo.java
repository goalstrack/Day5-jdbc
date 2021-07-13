package EmployeeApplication;

import java.util.Scanner;

public class UserDemo {
	
	
	EmployeeOperation empOperations = new EmployeeOperation();
	
	public static void main(String[] args) {
		
		UserDemo app = new UserDemo();
		while(true)
		{
			System.out.println("1. Add Employee.");
			System.out.println("2. Read Employee.");
			System.out.println("3. Display All Employee.");
			System.out.println("4. Update Employee");			
			System.out.println("5. Allocate Project");
			System.out.println("6. Display Employee associated with project");
			System.out.println("7. Login Logoff");
			System.out.println(" Enter User Option:- ");
			int choice = new Scanner(System.in).nextInt();
			
			switch(choice)
			{
				case 1:
					app.addEmployee();
					break;
				case 2:
					System.out.println("Enter Employee ID for Details");
					int searchID = new Scanner(System.in).nextInt();
					app.readEmployee(searchID);
					break;
				case 3: 
					app.displayAllEmployees();
					break;
				case 4:
					app.updateEmployee();
					break;
				case 5:
					app.allocateProject();
					break;
				case 6:
					app.displayprojectEmployee();
					break;
				case 7:
					app.doLoginLogoff();
					break;
				case 0: 
					System.exit(0);
			}//end switch
			
		}//end while
		
		
	}
	
	public void doLoginLogoff()
	{
		System.out.println("\n\n");
		System.out.println("Enter Employee ID forLogin Logout");
		int searchID = new Scanner(System.in).nextInt();
		
		Employee e = empOperations.getEmployeeByID(searchID);
		
		
		if(e!=null)
		{
			e.loginLogoff();
			
		}
		else
		{
			System.out.println(" Wrong Employee ID "+searchID);
		}
		
	}
	
	public void allocateProject()
	{
		System.out.println("Enter Project Name ");
		String projectName = new Scanner(System.in).nextLine();
		System.out.println("Enter Techonlogy Name ");
		String techName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Employee ID for Allocating Project");
		int searchID = new Scanner(System.in).nextInt();
		
		Project p = new Project(projectName, techName);
		
		boolean isProjectAllocated = empOperations.allocateProject(p, searchID);
		if(isProjectAllocated) System.out.println("Project "+p+" Allocated !!!");
		else System.out.println("Wrong Employee ID ");
		
	}
	public void displayprojectEmployee()
	{
		System.out.println("Enter Project Name ");
		String projectName = new Scanner(System.in).nextLine();
		empOperations.displayByProject(projectName);
		
	}
	public void displayAllEmployees()
	{
		Employee arr[] = empOperations.getArr();
		int employeeCount = empOperations.getIndex();
		
		System.out.println("\n ========== Employee LIST ==========\n");
		
		for (int i = 0; i <employeeCount; i++) {
			displayEmployeeDetails(arr[i]);
		}
	}
	
	public void addEmployee()
	{
		// HTML Form
		
		System.out.println("Enter Employee Name ");
		String empName = new Scanner(System.in).nextLine();
		
		System.out.println("Enter Employee ID ");
		int empID = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Employee Salary ");
		int empSalary = new Scanner(System.in).nextInt();
		
		System.out.println("Enter Employee Type (acc/dev/sales)");
		String empType = new Scanner(System.in).nextLine();
		
		Employee e = null;
		if(empType.equalsIgnoreCase("acc"))
		{
			e = new Accountant(empName, empID, empSalary, null);
		}
		else if(empType.equalsIgnoreCase("dev"))
		{
			e = new Developer(empName, empID, empSalary, null);
		}
		else if(empType.equalsIgnoreCase("sales"))
		{
			e = new SalesEmployee(empName, empID, empSalary, null);
		}
		
		
			
		boolean isInserted = empOperations.insertEmployee(e);
		
		if(isInserted)
		{
			System.out.println("Employee Saved !!");
		}
		else
		{
			System.out.println("Contact to System Admin");
		}
		
	}
	public void updateEmployee()
	{
		System.out.println("Enter id of the employee: ");
		int id=new Scanner(System.in).nextInt();
		Employee e = empOperations.getEmployeeByID(id);
		if(e != null)
		{
			System.out.println("Enter amount to increase or delete ");
			int amount=new Scanner(System.in).nextInt();
			System.out.println("Enter \n1.To add amount\n2.To reduce amount 3.No change\n Choice: ");
			int ch=new Scanner(System.in).nextInt();
			if(ch==1)
			{
				if(e instanceof SalesEmployee)
				{
					SalesEmployee se=(SalesEmployee) e;
					se.setIncentives(amount);
					se.setSalary();
					System.out.println("Incentive added");
				}
				else
				{
				int a=empOperations.addSalary(e, amount);
				System.out.println("Updated salary is : "+a);
				}
			}
			if(ch==2)
			{
				int a=empOperations.decreaseSalary(e, amount);
				System.out.println("Updated salary is : "+a);
				
			}
			if(ch==3)
			{
				System.out.println("No change");
			}
		}
		else
		{
			System.out.println("Wrong Employee ID");
		}
		
	}
	
	public void readEmployee(int employeeID)
	{
		Employee e = empOperations.getEmployeeByID(employeeID);
		if(e != null)
		{
			displayEmployeeDetails(e);
		}
		else
		{
			System.out.println("Wrong Employee ID "+employeeID);
		}
	}

	public void displayEmployeeDetails(Employee e)
	{
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee Salary "+e.getEmployeeSalary());
		System.out.println("Employee ID "+e.getEmployeeId());
		System.out.println("Type of employee is "+e.getClass().getName());
		if(e.getProject() == null)
		{
			System.out.println("Project Info :- Not Allocated ");
		}
		else
		{
			System.out.println("Project Info "+e.getProject().getProjectName()+" - "+e.getProject().getTechName());
		}
		
		if(e instanceof Accountant)
		{
			Accountant a = (Accountant)e;  // runtime exception :- classcastexception
			a.workOnTaxFile();
		}
		if(e instanceof SalesEmployee)
		{
			SalesEmployee sales = (SalesEmployee)e;
			sales.doMarketing("ABC-Product");
		}
		
		if(e instanceof Developer)
		{
			Developer dev = (Developer)e;
			dev.projectDocumentation();
		}
		
		
		
		
		
		
		
		System.out.println("-------------------------------------");
		
	}
	
	
}