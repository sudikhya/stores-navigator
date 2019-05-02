package wmt.navigate.stores.storesnavigator;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavigatorService {

	@Autowired
	NavigatorManager navigatorManager;

	@GetMapping("/navigationdata")
	public List<NavigationDetails> getNavigationDetails(@RequestParam("api_key") String apiKey,
			@RequestParam("venue_name") String venueName) throws JAXBException, IOException, JSONException {
		if (venueName.equals(null)) {
			return navigatorManager.getNavigationDetails(apiKey);
		} else {
			return navigatorManager.getNavigationDetailsForVenue(apiKey, venueName);
		}

	}
}
