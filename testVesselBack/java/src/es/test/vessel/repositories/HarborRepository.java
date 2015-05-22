package es.test.vessel.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.PagingAndSortingRepository;

import es.test.vessel.entities.Harbor;

public interface HarborRepository extends PagingAndSortingRepository<Harbor, BigInteger>{

}
