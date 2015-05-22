package es.test.vessel.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.PagingAndSortingRepository;

import es.test.vessel.entities.Vessel;

public interface VesselRepository extends PagingAndSortingRepository<Vessel,BigInteger>{

}
