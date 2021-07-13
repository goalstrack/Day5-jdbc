package InheritanceExample;

import java.util.HashSet;
import java.util.Set;

import InheritanceExample.ElectronicDevices;
public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ElectronicDevices> ed=new HashSet<>();
		
		ed.add(new AC(200, 300, 45,35,"ON"));
		ed.add(new AC(200, 300, 45,35,"ON"));
		ed.add(new AC(200, 300, 45,35,"ON"));
		ed.add(new AC(250, 300, 45,35,"ON"));
		
		ed.add(new WashingMachine(300, 10, 20, 30, null));

		ed.add(new WashingMachine(300, 10, 20, 30, null));
		System.out.println(ed);
	}

}
