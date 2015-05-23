package es.test.vessel.unit;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.test.vessel.configuration.AplicationContext;
import es.test.vessel.entities.Vessel;
import es.test.vessel.repositories.VesselRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AplicationContext.class)
public class TestRepositories {

	@Autowired
	private VesselRepository vesselService;
	
	@Test
	public void testVesselService(){
		Point point = new Point(-4.995266568,3.626632968);
		Distance distance = new Distance(1000,  Metrics.KILOMETERS);
		Page<Vessel> page = vesselService.findByPointNear(point, distance, new PageRequest(1,5));
		List<Vessel> listVessel = page.getContent();
		assertTrue(page.hasContent());
		
	}
}
