package MapExample;
import java.util.*;

import InheritanceExample.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String,List<ElectronicDevices>> m1=new HashMap<>();
		
		ElectronicDevices ed1=new AC(200, "LG", 15000, 7);
		ElectronicDevices ed2= new AC(1010, "whirlpool", 12000, 9);
		List<ElectronicDevices> l1=new ArrayList<>();
		l1.add(ed1);
		l1.add(ed2);
		m1.put("AC", l1);
		
		ElectronicDevices ed3 =new Laptop(400, "Lenovo", 15780, 11);
		ElectronicDevices ed4= new Laptop(1100, "HP", 19230, 23);
		List<ElectronicDevices> Laptoplist=new ArrayList<>();
		Laptoplist.add(ed3);
		Laptoplist.add(ed4);
		m1.put("Laptop", Laptoplist);
		
		ElectronicDevices ed5=new Computer(1500, "DELL", 80000, 55);
		ElectronicDevices ed6=new Computer(1244, "HP", 45322, 77);
		List<ElectronicDevices> Complist=new ArrayList<>();
		Complist.add(ed5);
		Complist.add(ed6);
		m1.put("Computer", Complist);
		
		ElectronicDevices ed7=new MobilePhone(1324, "TECNO", 7890, 45);
		ElectronicDevices ed8=new MobilePhone(1800, "Redmi", 13000, 43);
		List<ElectronicDevices> Moblist=new ArrayList<>();
		Moblist.add(ed7);
		Moblist.add(ed8);
		m1.put("MobilePhone", Moblist);
		
		ElectronicDevices ed9=new WashingMachine(2456, "LG", 79650, 49);
		ElectronicDevices ed10=new WashingMachine(2675, "Redmi", 120000, 78);
		List<ElectronicDevices> Wmlist=new ArrayList<>();
		Wmlist.add(ed9);
		Wmlist.add(ed10);
		m1.put("WashingMachine", Wmlist);
		int n=6;
		do
		{
			System.out.println("1.Laptop");
			System.out.println("2. Computer");
			System.out.println("3. Washing Machine");
			System.out.println("4.Mobile Phone");
			System.out.println("5. AC");
			System.out.println("6. Exit");
			System.out.println("Enter device to display: ");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			Iterator<String> itr= m1.keySet().iterator();
			MapDemo md=new MapDemo();
			switch(n)
			{
			case 1:
				md.doTask("Laptop", m1);		
				break;
			case 2:
				md.doTask("Computer", m1);
				break;
			case 3:
				md.doTask("WashingMachine", m1);
				break;
			case 4:
				md.doTask("MobilePhone", m1);
				break;
			case 5:
				md.doTask("AC", m1);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}while(n!=6);
		
	}
	public static void printSet(Collection<ElectronicDevices> c1,String message)
	{
		System.out.println("\n----------------------"+message+"-----------------------\n");
		for(ElectronicDevices e1:c1)
		{
			System.out.println(e1);
		}
	}

	public void doTask(String str,Map<String,List<ElectronicDevices>> m2)
	{
		List<ElectronicDevices> edList=m2.get(str);
		System.out.println("Enter Price range: ");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int h=sc.nextInt();
		System.out.println(str+" having price between "+l+" "+h+" are");
		for(ElectronicDevices ed:edList)
		{
			if(ed.getPrice()<=h && ed.getPrice()>=l)
			{
				System.out.println(ed);
			}
		}
		List<ElectronicDevices> d1=edList;
		Collections.sort(edList,new SortByPrice());
		printSet(edList,"Sorted based on price");
		
		Collections.sort(d1,new SortByRating());
		printSet(d1,"Sorted based on Rating");
	}
}
