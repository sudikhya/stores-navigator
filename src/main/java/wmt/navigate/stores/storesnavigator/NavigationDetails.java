package wmt.navigate.stores.storesnavigator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NavigationDetails {

	String _id;
	String updated;
	String created;
	String alias;
	NavigationVenue venue;
	String type;
	String venueId;
	String owner;
	Integer floor;
	String name;
	Boolean isPublished;
	NavigationLocation location;
	String description;
	NavigationProperties properties;
	NavigationAccess access;
	Boolean isPublic;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public NavigationVenue getVenue() {
		return venue;
	}
	public void setVenue(NavigationVenue venue) {
		this.venue = venue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVenueId() {
		return venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}
	public NavigationLocation getLocation() {
		return location;
	}
	public void setLocation(NavigationLocation location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public NavigationProperties getProperties() {
		return properties;
	}
	public void setProperties(NavigationProperties properties) {
		this.properties = properties;
	}
	public NavigationAccess getAccess() {
		return access;
	}
	public void setAccess(NavigationAccess access) {
		this.access = access;
	}
	public Boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
	
}
