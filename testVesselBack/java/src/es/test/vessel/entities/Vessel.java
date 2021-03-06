package es.test.vessel.entities;

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import es.test.vessel.transformers.GeoJsonBasicSerialize;

@Document(collection="vessels")
public class Vessel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger id;
	private String name;
	private Float width;
	private Float length;
	private Float draft;
	@JsonDeserialize(using = GeoJsonBasicSerialize.class)
	private GeoJsonPoint point;
	
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
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getDraft() {
		return draft;
	}
	public void setDraft(Float draft) {
		this.draft = draft;
	}
	public GeoJsonPoint getPoint() {
		return point;
	}
	public void setPoint(GeoJsonPoint point) {
		this.point = point;
	}
}
