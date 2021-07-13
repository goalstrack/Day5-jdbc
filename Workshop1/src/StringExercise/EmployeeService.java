package StringExercise;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        EmployeeService es=new  EmployeeService();
        String codes[]=es.getEmployeeCodes();
        String Locate[]=es.displayLocation(codes);
        int del=0,mum=0,bang=0,pune=0;
        for(String str:Locate)
        {
        	if(str.equals("Delhi"))
        	{
        		del++;
        	}
        	if(str.equals("Mumbai"))
        	{
        		mum++;
        	}
        	if(str.equals("Banglore"))
        	{
        		bang++;
        	}
        	if(str.equals("Pune"))
        	{
        		pune++;
        	}
        }
        System.out.println("Pune: "+pune+"\nDelhi: "+del+"\nBanglore: "+bang+"\nMumbai: "+mum);
        printByDepartment();

	}
	public static void printByDepartment()
	{
		Map<String,String[]> m1=new HashMap<>();
		String c[],e[],ci[];
		c=new String[10];
		e=new String[10];
		ci=new String[10];
		int i=0,j=0,k=0;
		for(String emp:employees)
		{
			if(emp.substring(3, 6).equals("001"))
			{
				c[i++]= emp.substring(0, 3);		
				
			}
			if(emp.substring(3, 6).equals("002"))
			{
				e[j++]= emp.substring(0, 3);
			}
			if(emp.substring(3, 6).equals("003"))
			{
				ci[k++]=emp.substring(0, 3);
			}
		}
		m1.put("Computer", c);
		m1.put("Electrical", e);
		m1.put("Civil", ci);
		System.out.println("Computer: "+m1.get("Computer").length+"\nElectrical: "+m1.get("Electrical").length+"\nCivil: "+m1.get("Civil").length);
		
	}
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		
		return codes;
	}
	public String[] displayLocation(String c[])
	{
		String Location[]=new String[employees.length];
		int count=-1,i=0;
		for(String l1:employees)
		{
			if(l1.substring(6).equals("011"))
			{
				System.out.println(c[i]+" "+"Delhi");
				Location[++count]="Delhi";
			}
			if(l1.substring(6).equals("022"))
			{
				System.out.println(c[i]+" "+"Mumbai");
				Location[++count]="Mumbai";
			}
			if(l1.substring(6).equals("080"))
			{
				System.out.println(c[i]+" "+"Banglore");
				Location[++count]="Banglore";
			}
			if(l1.substring(6).equals("020"))
			{
				System.out.println(c[i]+" "+"Pune");
				Location[++count]="Pune";
			}
			i++;
		}
		return Location;
	}
	


}
