package InheritanceExample;

import java.util.*;
public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ElectronicDevices> edcset=new TreeSet<>();
		edcset.add(new AC(200, "LG", 15000, 7));
		edcset.add(new AC(1010, "whirlpool", 12000, 9));
		edcset.add(new AC(400, "sony", 15780, 11));
		edcset.add(new AC(1100, "abcd", 19230, 23));
		
		edcset.add(new Computer(1500, "DELL", 80000, 55));
		edcset.add(new Computer(1244, "HP", 45322, 77));
		
		edcset.add(new MobilePhone(1324, "TECNO", 7890, 45));
		printSet(edcset, "Default sort by power");
		
		List<ElectronicDevices> l1=new ArrayList<>();
		l1.addAll(edcset);
		
		Collections.sort(l1, new SortByPrice());
		printSet(l1,"sort by Price");
		
		
		List<ElectronicDevices> ratingBasedList=new ArrayList<>();
		ratingBasedList.addAll(edcset);
		
		Collections.sort(ratingBasedList, new SortByRating());
		printSet(ratingBasedList,"sort by Rating");
		
	}
	public static void printSet(Collection<ElectronicDevices> c1,String message)
	{
		System.out.println("\n----------------------"+message+"-----------------------\n");
		for(ElectronicDevices e1:c1)
		{
			System.out.println(e1);
		}
	}

}
