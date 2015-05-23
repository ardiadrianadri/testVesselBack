package es.test.vessel.repositories;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import es.test.vessel.entities.Harbor;

public interface HarborRepository extends PagingAndSortingRepository<Harbor, BigInteger>{
	public Page<Harbor> findByNameContaining(@Param("name")String name,Pageable pageable);
}
