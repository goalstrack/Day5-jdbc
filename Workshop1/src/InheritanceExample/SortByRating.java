package InheritanceExample;

import java.util.Comparator;

public class SortByRating implements Comparator<ElectronicDevices> {

	@Override
	public int compare(ElectronicDevices ed1, ElectronicDevices ed2) {
		// TODO Auto-generated method stub
		
		return ed1.getRatings()-ed2.getRatings();
	}
	

}
