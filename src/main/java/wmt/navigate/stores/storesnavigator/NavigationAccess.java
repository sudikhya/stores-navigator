package wmt.navigate.stores.storesnavigator;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NavigationAccess {

	List<String> accessGroups;
	Boolean isPublic;

	public List<String> getAccessGroups() {
		return accessGroups;
	}

	public void setAccessGroups(List<String> accessGroups) {
		this.accessGroups = accessGroups;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	
}
