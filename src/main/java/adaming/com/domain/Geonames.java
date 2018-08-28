package adaming.com.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Geonames")
public class Geonames {

	@Id
	private ObjectId _id;
	private String contry_id;
	private String contry_name;
	@DBRef(db = "DocumentEmotion")
	private Float longitude;
	private Float latitude;

	
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getContry_id() {
		return contry_id;
	}

	public void setContry_id(String contry_id) {
		this.contry_id = contry_id;
	}

	public String getContry_name() {
		return contry_name;
	}

	public void setContry_name(String contry_name) {
		this.contry_name = contry_name;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

}
