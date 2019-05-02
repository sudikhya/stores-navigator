package wmt.navigate.stores.storesnavigator;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NavigationVenue {
	String _id;
	String name;
	List<NavigationTranslation>  translations;
	Boolean isPublished;
	NavigationGeometry geometry;
	String defaultLanguage;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
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
	
	public String getDefaultLanguage() {
		return defaultLanguage;
	}
	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	public List<NavigationTranslation> getTranslations() {
		return translations;
	}
	public void setTranslations(List<NavigationTranslation> translations) {
		this.translations = translations;
	}
	public NavigationGeometry getGeometry() {
		return geometry;
	}
	public void setGeometry(NavigationGeometry geometry) {
		this.geometry = geometry;
	}
	
	
}
