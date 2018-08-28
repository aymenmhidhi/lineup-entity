package adaming.com.domain;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Site")
public class Site {

	@Id
	private String id;
	HashMap<String, ?> values;
	SiteType type;
	Geonames location;

}
