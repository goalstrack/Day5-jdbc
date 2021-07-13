package InheritanceExample;

import java.util.Comparator;

public class SortByPrice implements Comparator<ElectronicDevices> {

	@Override
	public int compare(ElectronicDevices ed1, ElectronicDevices ed2) {
		// TODO Auto-generated method stub
		return ed1.getPrice()-ed2.getPrice();
	}
	
}
