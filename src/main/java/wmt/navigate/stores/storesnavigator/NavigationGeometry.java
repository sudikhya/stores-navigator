package wmt.navigate.stores.storesnavigator;

import java.util.List;

public class NavigationGeometry {
	List<List<List<Integer>>> coordinates;
	String type;
	public List<List<List<Integer>>> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<List<List<Integer>>> coordinates) {
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
