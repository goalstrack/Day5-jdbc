package EmployeeApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		Project p1=new Project("tech2021", "python");
		Employee e1=new Employee("Bhakti", 22, 5000,p1 );
		Employee e2=new Employee("shakti", 22, 5700,p1 );
		Employee e3=new Employee("Mukti", 22, 9000,p1 );
		Employee e4=new Employee("Shradha", 22, 5670,p1 );
		Employee e5=new Employee("Ramesh", 22, 10000,new Project("Summit2020", "Java") );
		Employee e6=new Employee("Aditi", 22, 56700,new Project("Summit2020", "Java") );
		Employee e7=new Employee("Shiv", 23, 57000,new Project("Summit2020", "Java") );
		
		
		List<Employee> l1=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		System.out.println("\nEmployee with Maximum salary");
		maxofEmployee(l1);
		
		System.out.println("\nEmployee with Minimum salary");
		//minofEmployee(l1);
		//filterEmployee(l1);
		mapDemo(l1);
	}
	public static void mapDemo(List<Employee> l1)
	{
		l1= l1.stream().map(emp1->{
			int newSalary=emp1.getEmployeeSalary()+1400;
			emp1.setEmployeeSalary(newSalary);
			return emp1;
		}).collect(Collectors.toList());
		for(Employee e:l1)
		{
			System.out.println(e);
		}
	}
	public static void filterEmployee(List<Employee> l1)
	{
		System.out.println("\n-------------------Employee Filtered based on salary--------------------");
		List<Employee> empFiltered=l1.stream().filter(emp1->{
			return emp1.getEmployeeSalary()>=1000 && emp1.getEmployeeSalary()<=7000;
		}).collect(Collectors.toList());
		for(Employee e:empFiltered)
		{
			System.out.println(e);
		}
		System.out.println("\n-----------------Employee Filteres based on minimum salary in particular project--------------");
		Comparator<Employee> salaryComparator=(emp1,emp2) ->
		{
			return emp1.getEmployeeSalary()-emp2.getEmployeeSalary();
		};
		Employee e1=l1.stream().filter(emp1->{
			String str=emp1.getProject().getProjectName();
			return str.equals("tech2021");
		}).min(salaryComparator).get();
		System.out.println(e1);
		
		System.out.println("\n-------------------Employee Filtered based on project--------------------");
		List<Employee> empFilter=l1.stream().filter(emp1->{
				String str=emp1.getProject().getProjectName();
			return str.equals("Summit2020");
		}).collect(Collectors.toList());
		for(Employee e:empFilter)
		{
			System.out.println(e);
		}
		
	}
	public static void maxofEmployee(List<Employee> l1)
	{
		
		
		Comparator<Employee> salaryComparator=(emp1,emp2) ->
		{
			return emp1.getEmployeeSalary()-emp2.getEmployeeSalary();
		};
		Employee e=l1.stream().max(salaryComparator).get();
		System.out.println(e);
	}
	public static void minofEmployee(List<Employee> l1)
	{
		
		
		Comparator<Employee> salaryComparator=(emp1,emp2) ->
		{
			return emp1.getEmployeeSalary()-emp2.getEmployeeSalary();
		};
		Employee e=l1.stream().min(salaryComparator).get();
		System.out.println(e);
	}
}
