package es.test.vessel.repositories;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import es.test.vessel.entities.Vessel;

public interface VesselRepository extends PagingAndSortingRepository<Vessel,BigInteger>{

	//FindBy queries with only Point
	public Page<Vessel> findByPointNear(@Param ("point") Point point,@Param("distance")Distance distance, Pageable pageable);
		//Width
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Length
	public Page<Vessel> findByPointNearAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Draft
	public Page<Vessel> findByPointNearAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
	//Width and Length
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
	//Width and Draft
		//GreaterThanEqual both
		//GreaterThanEqual GreaterThan
		//GreaterThanEqual LessThan
		//GreaterThanEqual LessThanEqual
		//GreaterThanEqual between
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByPointNearAndWidthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByPointNearAndWidthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByPointNearAndWidthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	//Length and Draft
	//GreaterThanEqual both
			//GreaterThanEqual GreaterThan
			//GreaterThanEqual LessThan
			//GreaterThanEqual LessThanEqual
			//GreaterThanEqual between
		public Page<Vessel> findByPointNearAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByPointNearAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByPointNearAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByPointNearAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByPointNearAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
	//width,length and draft
		//GreaterThanEqual, GreaterThanEqual,GreaterThanEqual
		//GreaterThanEqual,GreaterThanEqual,GreaterThan
		//GreaterThanEqual,GreaterThanEqual,LessThan
		//GreaterThanEqual,GreaterThanEqual,LessThanEqual
		//GreaterThanEqual,GreaterThanEqual,between
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,GreaterThan,GreaterThanEqual
		//GreaterThanEqual,GreaterThan,GreaterThan
		//GreaterThanEqual,GreaterThan,LessThan
		//GreaterThanEqual,GreaterThan,LessThanEqual
		//GreaterThanEqual,GreaterThan, between
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThan,GreaterThanEqual
		//GreaterThanEqual,LessThan,GreaterThan
		//GreaterThanEqual,LessThan,LessThan
		//GreaterThanEqual,LessThan,LessThanEqual,
		//GreaterThanEqual,LessThan, between
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThanEqual,GreaterThanEqual
		//GreaterThanEqual,LessThanEqual,GreaterThan
		//GreaterThanEqual,LessThanEqual,LessThan
		//GreaterThanEqual,LessThanEqual,LessThanEqual
		//GreaterThanEqual,LessThanEqual,between
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,Between,GreaterThanEqual
		//GreaterThanEqual,Between,GreaterThan
		//GreaterThanEqual,Between,LessThan
		//GreaterThanEqual,Between,LessThanEqual
		//GreaterThanEqual,Between,Between
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThanEqual,GreaterThanEqual
		//GreaterThan,GreaterThanEqual,GreaterThan
		//GreaterThan,GreaterThanEqual,LessThan
		//GreaterThan,GreaterThanEqual,LessThanEqual
		//GreaterThan,GreaterThanEqual,between
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThan,GreaterThanEqual
		//GreaterThan,GreaterThan,GreaterThan
		//GreaterThan,GreaterThan,LessThan
		//GreaterThan,GreaterThan,LessThanEqual
		//GreaterThan,GreaterThan,between
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThan,GreaterThanEqual
		//GreaterThan,LessThan,GreaterThan
		//GreaterThan,LessThan,LessThan
		//GreaterThan,LessThan,LessThanEqual
		//GreaterThan,LessThan,between
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThanEqual,GreaterThanEqual
		//GreaterThan,LessThanEqual,GreaterThan
		//GreaterThan,LessThanEqual,LessThan
		//GreaterThan,LessThanEqual,LessThanEqual
		//GreaterThan,LessThanEqual,Between
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,Between,GreaterThanEqual
		//GreaterThan,Between,GreaterThan
		//GreaterThan,Between,LessThan
		//GreaterThan,Between,Between
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthGreaterThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThanEqual,GreaterThanEqual
		//LessThan,GreaterThanEqual,GreaterThan
		//LessThan,GreaterThanEqual,LessThan
		//LessThan,GreaterThanEqual,LessThanEqual
		//LessThan,GreaterThanEqual,between
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThan,GreaterThanEqual
		//LessThan,GreaterThan,GreaterThan
		//LessThan,GreaterThan,LessThan
		//LessThan,GreaterThan,LessThanEqual
		//LessThan,GreaterThan,Between
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThan,GreaterThanEqual
		//LessThan,LessThan,GreaterThan
		//LessThan,LessThan,LessThan
		//LessThan,LessThan,LessThanEqual
		//LessThan,LessThan,Between
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThanEqual,GreaterThanEqual
		//LessThan,LessThanEqual,GreaterThan
		//LessThan,LessThanEqual,LessThan
		//LessThan,LessThanEqual,LessThanEqual
		//LessThan,LessThanEqual,between
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,Between,GreaterThanEqual
		//LessThan,Between,GreaterThan
		//LessThan,Between,LessThan
		//LessThan,Between,LessThanEqual
		//LessThan,Between,Between
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThanEqual,GreaterThanEqual
		//LessThanEqual,GreaterThanEqual,GreaterThan
		//LessThanEqual,GreaterThanEqual,LessThan
		//LessThanEqual,GreaterThanEqual,LessThanEqual
		//LessThanEqual,GreaterThanEqual,Between
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThan,GreaterThanEqual
		//LessThanEqual,GreaterThan,GreaterThan
		//LessThanEqual,GreaterThan,LessThan
		//LessThanEqual,GreaterThan,LessThanEqual
		//LessThanEqual,GreaterThan,Between
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThan,GreaterThanEqual
		//LessThanEqual,LessThan,GreaterThan
		//LessThanEqual,LessThan,LessThan
		//LessThanEqual,LessThan,LessThanEqual
		//LessThanEqual,LessThan,Between
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThanEqual,GreaterThanEqual
		//LessThanEqual,LessThanEqual,GreaterThan
		//LessThanEqual,LessThanEqual,LessThan
		//LessThanEqual,LessThanEqual,LessThanEqual
		//LessThanEqual,LessThanEqual,Between
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,Between,GreaterThanEqual
		//LessThanEqual,Between,GreaterThan
		//LessThanEqual,Between,LessThan
		//LessThanEqual,Between,LessThanEqual
		//LessThanEqual,Between,Between
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThanEqual,GreaterThanEqual
		//Between,GreaterThanEqual,GreaterThan
		//Between,GreaterThanEqual,LessThan
		//Between,GreaterThanEqual,LessThanEqual
		//Between,GreaterThanEqual,Between
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThan,GreaterThanEqual
		//Between,GreaterThan,GreaterThan
		//Between,GreaterThan,LessThan
		//Between,GreaterThan,LessThanEqual
		//Between,GreaterThan,Between
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThan,GreaterThanEqual
		//Between,LessThan,GreaterThan
		//Between,LessThan,LessThan
		//Between,LessThan,LessThanEqual
		//Between,LessThan,Between
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThanEqual,GreaterThanEqual
		//Between,LessThanEqual,GreaterThan
		//Between,LessThanEqual,LessThan
		//Between,LessThanEqual,LessThanEqual
		//Between,LessThanEqual,Between
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,Between,GreaterThanEqual
		//Between,Between,GreaterThan
		//Between,Between,LessThan
		//Between,Between,LessThanEqual
		//Between,Between,Between
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByPointNearAndWidthBetweenAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	//FindBy queries with Point and name
	public Page<Vessel> findByNameContainingAndPointNear(@Param("name")String name,@Param ("point") Point point,@Param("distance")Distance distance, Pageable pageable);
	//Width
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Length
	public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Draft
	public Page<Vessel> findByNameContainingAndPointNearAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
	//Width and Length
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
	//Width and Draft
		//GreaterThanEqual both
		//GreaterThanEqual GreaterThan
		//GreaterThanEqual LessThan
		//GreaterThanEqual LessThanEqual
		//GreaterThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	//Length and Draft
	//GreaterThanEqual both
			//GreaterThanEqual GreaterThan
			//GreaterThanEqual LessThan
			//GreaterThanEqual LessThanEqual
			//GreaterThanEqual between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
	//width,length and draft
		//GreaterThanEqual, GreaterThanEqual,GreaterThanEqual
		//GreaterThanEqual,GreaterThanEqual,GreaterThan
		//GreaterThanEqual,GreaterThanEqual,LessThan
		//GreaterThanEqual,GreaterThanEqual,LessThanEqual
		//GreaterThanEqual,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,GreaterThan,GreaterThanEqual
		//GreaterThanEqual,GreaterThan,GreaterThan
		//GreaterThanEqual,GreaterThan,LessThan
		//GreaterThanEqual,GreaterThan,LessThanEqual
		//GreaterThanEqual,GreaterThan, between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThan,GreaterThanEqual
		//GreaterThanEqual,LessThan,GreaterThan
		//GreaterThanEqual,LessThan,LessThan
		//GreaterThanEqual,LessThan,LessThanEqual,
		//GreaterThanEqual,LessThan, between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThanEqual,GreaterThanEqual
		//GreaterThanEqual,LessThanEqual,GreaterThan
		//GreaterThanEqual,LessThanEqual,LessThan
		//GreaterThanEqual,LessThanEqual,LessThanEqual
		//GreaterThanEqual,LessThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,Between,GreaterThanEqual
		//GreaterThanEqual,Between,GreaterThan
		//GreaterThanEqual,Between,LessThan
		//GreaterThanEqual,Between,LessThanEqual
		//GreaterThanEqual,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThanEqual,GreaterThanEqual
		//GreaterThan,GreaterThanEqual,GreaterThan
		//GreaterThan,GreaterThanEqual,LessThan
		//GreaterThan,GreaterThanEqual,LessThanEqual
		//GreaterThan,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThan,GreaterThanEqual
		//GreaterThan,GreaterThan,GreaterThan
		//GreaterThan,GreaterThan,LessThan
		//GreaterThan,GreaterThan,LessThanEqual
		//GreaterThan,GreaterThan,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThan,GreaterThanEqual
		//GreaterThan,LessThan,GreaterThan
		//GreaterThan,LessThan,LessThan
		//GreaterThan,LessThan,LessThanEqual
		//GreaterThan,LessThan,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThanEqual,GreaterThanEqual
		//GreaterThan,LessThanEqual,GreaterThan
		//GreaterThan,LessThanEqual,LessThan
		//GreaterThan,LessThanEqual,LessThanEqual
		//GreaterThan,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,Between,GreaterThanEqual
		//GreaterThan,Between,GreaterThan
		//GreaterThan,Between,LessThan
		//GreaterThan,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThanEqual,GreaterThanEqual
		//LessThan,GreaterThanEqual,GreaterThan
		//LessThan,GreaterThanEqual,LessThan
		//LessThan,GreaterThanEqual,LessThanEqual
		//LessThan,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThan,GreaterThanEqual
		//LessThan,GreaterThan,GreaterThan
		//LessThan,GreaterThan,LessThan
		//LessThan,GreaterThan,LessThanEqual
		//LessThan,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThan,GreaterThanEqual
		//LessThan,LessThan,GreaterThan
		//LessThan,LessThan,LessThan
		//LessThan,LessThan,LessThanEqual
		//LessThan,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThanEqual,GreaterThanEqual
		//LessThan,LessThanEqual,GreaterThan
		//LessThan,LessThanEqual,LessThan
		//LessThan,LessThanEqual,LessThanEqual
		//LessThan,LessThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,Between,GreaterThanEqual
		//LessThan,Between,GreaterThan
		//LessThan,Between,LessThan
		//LessThan,Between,LessThanEqual
		//LessThan,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThanEqual,GreaterThanEqual
		//LessThanEqual,GreaterThanEqual,GreaterThan
		//LessThanEqual,GreaterThanEqual,LessThan
		//LessThanEqual,GreaterThanEqual,LessThanEqual
		//LessThanEqual,GreaterThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThan,GreaterThanEqual
		//LessThanEqual,GreaterThan,GreaterThan
		//LessThanEqual,GreaterThan,LessThan
		//LessThanEqual,GreaterThan,LessThanEqual
		//LessThanEqual,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThan,GreaterThanEqual
		//LessThanEqual,LessThan,GreaterThan
		//LessThanEqual,LessThan,LessThan
		//LessThanEqual,LessThan,LessThanEqual
		//LessThanEqual,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThanEqual,GreaterThanEqual
		//LessThanEqual,LessThanEqual,GreaterThan
		//LessThanEqual,LessThanEqual,LessThan
		//LessThanEqual,LessThanEqual,LessThanEqual
		//LessThanEqual,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,Between,GreaterThanEqual
		//LessThanEqual,Between,GreaterThan
		//LessThanEqual,Between,LessThan
		//LessThanEqual,Between,LessThanEqual
		//LessThanEqual,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThanEqual,GreaterThanEqual
		//Between,GreaterThanEqual,GreaterThan
		//Between,GreaterThanEqual,LessThan
		//Between,GreaterThanEqual,LessThanEqual
		//Between,GreaterThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThan,GreaterThanEqual
		//Between,GreaterThan,GreaterThan
		//Between,GreaterThan,LessThan
		//Between,GreaterThan,LessThanEqual
		//Between,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThan,GreaterThanEqual
		//Between,LessThan,GreaterThan
		//Between,LessThan,LessThan
		//Between,LessThan,LessThanEqual
		//Between,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThanEqual,GreaterThanEqual
		//Between,LessThanEqual,GreaterThan
		//Between,LessThanEqual,LessThan
		//Between,LessThanEqual,LessThanEqual
		//Between,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,Between,GreaterThanEqual
		//Between,Between,GreaterThan
		//Between,Between,LessThan
		//Between,Between,LessThanEqual
		//Between,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	
	//FindBy queries with only name
	public Page<Vessel> findByNameContaining(@Param("name")String name, Pageable pageable);
	
	//Width
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
			//Length
		public Page<Vessel> findByNameContainingAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
			//Draft
		public Page<Vessel> findByNameContainingAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
		//Width and Length
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
		//Width and Draft
			//GreaterThanEqual both
			//GreaterThanEqual GreaterThan
			//GreaterThanEqual LessThan
			//GreaterThanEqual LessThanEqual
			//GreaterThanEqual between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
		//Length and Draft
		//GreaterThanEqual both
				//GreaterThanEqual GreaterThan
				//GreaterThanEqual LessThan
				//GreaterThanEqual LessThanEqual
				//GreaterThanEqual between
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//GreaterThan GreaterThanEqual
				//GreaterThan both
				//GreaterThan LessThan
				//GreaterThan LessThanEqual
				//GreaterThan between
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//LessThan GreaterThanEqual
				//LessThan GreaterThan
				//LessThan both
				//LessThan LessThanEqual
				//LessThan between
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//LessThanEqual GreaterThanEqual
				//LessThanEqual GreaterThan
				//LessThanEqual LessThan
				//LessThanEqual both
				//LessThanEqual between
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//Between GreaterThanEqual
				//Between GreaterThan
				//Between LessThan
				//Between LessThanEqual
				//Between both
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
				
		//width,length and draft
			//GreaterThanEqual, GreaterThanEqual,GreaterThanEqual
			//GreaterThanEqual,GreaterThanEqual,GreaterThan
			//GreaterThanEqual,GreaterThanEqual,LessThan
			//GreaterThanEqual,GreaterThanEqual,LessThanEqual
			//GreaterThanEqual,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThanEqual,GreaterThan,GreaterThanEqual
			//GreaterThanEqual,GreaterThan,GreaterThan
			//GreaterThanEqual,GreaterThan,LessThan
			//GreaterThanEqual,GreaterThan,LessThanEqual
			//GreaterThanEqual,GreaterThan, between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			
			//GreaterThanEqual,LessThan,GreaterThanEqual
			//GreaterThanEqual,LessThan,GreaterThan
			//GreaterThanEqual,LessThan,LessThan
			//GreaterThanEqual,LessThan,LessThanEqual,
			//GreaterThanEqual,LessThan, between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			
			//GreaterThanEqual,LessThanEqual,GreaterThanEqual
			//GreaterThanEqual,LessThanEqual,GreaterThan
			//GreaterThanEqual,LessThanEqual,LessThan
			//GreaterThanEqual,LessThanEqual,LessThanEqual
			//GreaterThanEqual,LessThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThanEqual,Between,GreaterThanEqual
			//GreaterThanEqual,Between,GreaterThan
			//GreaterThanEqual,Between,LessThan
			//GreaterThanEqual,Between,LessThanEqual
			//GreaterThanEqual,Between,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,GreaterThanEqual,GreaterThanEqual
			//GreaterThan,GreaterThanEqual,GreaterThan
			//GreaterThan,GreaterThanEqual,LessThan
			//GreaterThan,GreaterThanEqual,LessThanEqual
			//GreaterThan,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,GreaterThan,GreaterThanEqual
			//GreaterThan,GreaterThan,GreaterThan
			//GreaterThan,GreaterThan,LessThan
			//GreaterThan,GreaterThan,LessThanEqual
			//GreaterThan,GreaterThan,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,LessThan,GreaterThanEqual
			//GreaterThan,LessThan,GreaterThan
			//GreaterThan,LessThan,LessThan
			//GreaterThan,LessThan,LessThanEqual
			//GreaterThan,LessThan,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,LessThanEqual,GreaterThanEqual
			//GreaterThan,LessThanEqual,GreaterThan
			//GreaterThan,LessThanEqual,LessThan
			//GreaterThan,LessThanEqual,LessThanEqual
			//GreaterThan,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,Between,GreaterThanEqual
			//GreaterThan,Between,GreaterThan
			//GreaterThan,Between,LessThan
			//GreaterThan,Between,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,GreaterThanEqual,GreaterThanEqual
			//LessThan,GreaterThanEqual,GreaterThan
			//LessThan,GreaterThanEqual,LessThan
			//LessThan,GreaterThanEqual,LessThanEqual
			//LessThan,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,GreaterThan,GreaterThanEqual
			//LessThan,GreaterThan,GreaterThan
			//LessThan,GreaterThan,LessThan
			//LessThan,GreaterThan,LessThanEqual
			//LessThan,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,LessThan,GreaterThanEqual
			//LessThan,LessThan,GreaterThan
			//LessThan,LessThan,LessThan
			//LessThan,LessThan,LessThanEqual
			//LessThan,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,LessThanEqual,GreaterThanEqual
			//LessThan,LessThanEqual,GreaterThan
			//LessThan,LessThanEqual,LessThan
			//LessThan,LessThanEqual,LessThanEqual
			//LessThan,LessThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,Between,GreaterThanEqual
			//LessThan,Between,GreaterThan
			//LessThan,Between,LessThan
			//LessThan,Between,LessThanEqual
			//LessThan,Between,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,GreaterThanEqual,GreaterThanEqual
			//LessThanEqual,GreaterThanEqual,GreaterThan
			//LessThanEqual,GreaterThanEqual,LessThan
			//LessThanEqual,GreaterThanEqual,LessThanEqual
			//LessThanEqual,GreaterThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,GreaterThan,GreaterThanEqual
			//LessThanEqual,GreaterThan,GreaterThan
			//LessThanEqual,GreaterThan,LessThan
			//LessThanEqual,GreaterThan,LessThanEqual
			//LessThanEqual,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,LessThan,GreaterThanEqual
			//LessThanEqual,LessThan,GreaterThan
			//LessThanEqual,LessThan,LessThan
			//LessThanEqual,LessThan,LessThanEqual
			//LessThanEqual,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,LessThanEqual,GreaterThanEqual
			//LessThanEqual,LessThanEqual,GreaterThan
			//LessThanEqual,LessThanEqual,LessThan
			//LessThanEqual,LessThanEqual,LessThanEqual
			//LessThanEqual,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,Between,GreaterThanEqual
			//LessThanEqual,Between,GreaterThan
			//LessThanEqual,Between,LessThan
			//LessThanEqual,Between,LessThanEqual
			//LessThanEqual,Between,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,GreaterThanEqual,GreaterThanEqual
			//Between,GreaterThanEqual,GreaterThan
			//Between,GreaterThanEqual,LessThan
			//Between,GreaterThanEqual,LessThanEqual
			//Between,GreaterThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,GreaterThan,GreaterThanEqual
			//Between,GreaterThan,GreaterThan
			//Between,GreaterThan,LessThan
			//Between,GreaterThan,LessThanEqual
			//Between,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,LessThan,GreaterThanEqual
			//Between,LessThan,GreaterThan
			//Between,LessThan,LessThan
			//Between,LessThan,LessThanEqual
			//Between,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,LessThanEqual,GreaterThanEqual
			//Between,LessThanEqual,GreaterThan
			//Between,LessThanEqual,LessThan
			//Between,LessThanEqual,LessThanEqual
			//Between,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,Between,GreaterThanEqual
			//Between,Between,GreaterThan
			//Between,Between,LessThan
			//Between,Between,LessThanEqual
			//Between,Between,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftGreaterThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftGreaterThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftLessThan(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftBetween(@Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
	
}
