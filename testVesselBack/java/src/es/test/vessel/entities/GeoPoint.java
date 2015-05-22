package es.test.vessel.entities;

import java.io.Serializable;

public class GeoPoint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String TYPE_2DSPHERE = "Point";
	
	private String type = TYPE_2DSPHERE;
	private Double[] coordinates = new Double[2];
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
	}
}
