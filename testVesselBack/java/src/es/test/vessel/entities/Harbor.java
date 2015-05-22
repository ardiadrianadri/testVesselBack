package es.test.vessel.entities;

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="harbors")
public class Harbor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger id;
	private String name;
	private GeoJsonPoint  point;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GeoJsonPoint getPoint() {
		return point;
	}
	public void setPoint(GeoJsonPoint point) {
		this.point = point;
	}
}
