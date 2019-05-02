package wmt.navigate.stores.storesnavigator;

import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javax.xml.transform.stream.StreamSource;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.apache.commons.io.IOUtils;
@Component
public class NavigatorManager {
	//https://api.mapwize.io/v1/beacons?api_key=32e8d80f1421900284ac4e257d8c1333
	String url = "https://api.mapwize.io/v1/beacons?api_key=32e8d80f1421900284ac4e257d8c1333";
	public List<NavigationDetails> getNavigationDetails(String apiKey)
        throws JAXBException, IOException, JSONException {
		System.setProperty("javax.xml.bind.context.factory","org.eclipse.persistence.jaxb.JAXBContextFactory");
		ObjectMapper mapper = new ObjectMapper();
        TypeFactory typeFactory = mapper.getTypeFactory();
        CollectionType collectionType = typeFactory.constructCollectionType(
                                            List.class, NavigationDetails.class);
		//mapper.readValue(new URL(url), NavigationDetails.class);
		return mapper.readValue(new URL(url), collectionType);
	}
	
	public List<NavigationDetails> getNavigationDetailsForVenue(String apiKey, String venueName)
	        throws JAXBException, IOException, JSONException {
			System.setProperty("javax.xml.bind.context.factory","org.eclipse.persistence.jaxb.JAXBContextFactory");
			List<NavigationDetails> navigationDetails = getNavigationDetails(apiKey);
			List<NavigationDetails> resultList = new ArrayList<>();
			System.out.println("Venue name"+venueName);
			for(NavigationDetails nd:navigationDetails) {
				String storeVenue = nd.getVenue().getName();
				if(storeVenue.equals(venueName)) {
					resultList.add(nd);
				}
			}
			return resultList;
		}
}
