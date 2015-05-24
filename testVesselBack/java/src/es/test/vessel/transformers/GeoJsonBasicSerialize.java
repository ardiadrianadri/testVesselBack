package es.test.vessel.transformers;

import java.io.IOException;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class GeoJsonBasicSerialize extends JsonDeserializer<GeoJsonPoint>{

	@Override
	public GeoJsonPoint deserialize (JsonParser jp, DeserializationContext ctxt) throws JsonParseException, IOException{
		 JsonNode tree = jp.getCodec().readTree(jp);
		 Double x = tree.get("x").asDouble();
		 Double y = tree.get("y").asDouble();
		 
		GeoJsonPoint point = new GeoJsonPoint(x, y);
		
		return point;
	}
}
