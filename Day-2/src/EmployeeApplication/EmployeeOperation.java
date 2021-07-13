package EmployeeApplication;

public class EmployeeOperation {
	
	// replace with Database
	Employee arr[] = new Employee[1000];
	// collection unlimitted data
	int index = 0;
	
	// method in Server to save Employee
	public boolean insertEmployee(Employee e)
	{
		// replace SQL insert Query
		arr[index++] = e;
		return true;
	}
	
								//	102
	public Employee getEmployeeByID(int searchId)
	{
		for (int i = 0; i < index; i++) {
		
			//   null.getEmployeeID();
			if(arr[i].getEmployeeId() == searchId)
			{
				return arr[i];
			}
		}
		return null; // if no match
	}
	public int addSalary(Employee e,int incr)
	{
		int sal=e.getEmployeeSalary();
		e.setEmployeeSalary(sal+incr);
		return e.getEmployeeSalary();
	}
	public int decreaseSalary(Employee e,int dec)
	{
		int sal=e.getEmployeeSalary();
		e.setEmployeeSalary(sal-dec);
		return e.getEmployeeSalary();
	}

	public Employee[] getArr() {
		return arr;
	}


	public void setArr(Employee[] arr) {
		this.arr = arr;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}
	public void displayByProject(String name)
	{
		UserDemo u1=new UserDemo();
		int flag=0;
		for(int i=0;i<index;i++)
		{
			if(arr[i].getProject().getProjectName().equalsIgnoreCase(name))
			{
				//h
				u1.displayEmployeeDetails(arr[i]);
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("No employee associated with project");
		}
		
	}
	
	public boolean allocateProject(Project p,int empId)
	{
		Employee e = getEmployeeByID(empId);

		if (e != null) {
			e.setProject(p);
			return true;
		} else
			return false;
	}
}