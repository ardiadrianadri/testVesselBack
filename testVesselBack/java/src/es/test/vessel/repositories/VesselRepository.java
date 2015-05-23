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
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Length
	public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
		//Draft
	public Page<Vessel> findByNameContainingAndPointNearAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
	
	//Width and Length
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
	
	//Width and Draft
		//GreaterThanEqual both
		//GreaterThanEqual GreaterThan
		//GreaterThanEqual LessThan
		//GreaterThanEqual LessThanEqual
		//GreaterThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//GreaterThan GreaterThanEqual
		//GreaterThan both
		//GreaterThan LessThan
		//GreaterThan LessThanEqual
		//GreaterThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThan GreaterThanEqual
		//LessThan GreaterThan
		//LessThan both
		//LessThan LessThanEqual
		//LessThan between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//LessThanEqual GreaterThanEqual
		//LessThanEqual GreaterThan
		//LessThanEqual LessThan
		//LessThanEqual both
		//LessThanEqual between
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
	
		//Between GreaterThanEqual
		//Between GreaterThan
		//Between LessThan
		//Between LessThanEqual
		//Between both
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
	public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	//Length and Draft
	//GreaterThanEqual both
			//GreaterThanEqual GreaterThan
			//GreaterThanEqual LessThan
			//GreaterThanEqual LessThanEqual
			//GreaterThanEqual between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
	//width,length and draft
		//GreaterThanEqual, GreaterThanEqual,GreaterThanEqual
		//GreaterThanEqual,GreaterThanEqual,GreaterThan
		//GreaterThanEqual,GreaterThanEqual,LessThan
		//GreaterThanEqual,GreaterThanEqual,LessThanEqual
		//GreaterThanEqual,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,GreaterThan,GreaterThanEqual
		//GreaterThanEqual,GreaterThan,GreaterThan
		//GreaterThanEqual,GreaterThan,LessThan
		//GreaterThanEqual,GreaterThan,LessThanEqual
		//GreaterThanEqual,GreaterThan, between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThan,GreaterThanEqual
		//GreaterThanEqual,LessThan,GreaterThan
		//GreaterThanEqual,LessThan,LessThan
		//GreaterThanEqual,LessThan,LessThanEqual,
		//GreaterThanEqual,LessThan, between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		
		//GreaterThanEqual,LessThanEqual,GreaterThanEqual
		//GreaterThanEqual,LessThanEqual,GreaterThan
		//GreaterThanEqual,LessThanEqual,LessThan
		//GreaterThanEqual,LessThanEqual,LessThanEqual
		//GreaterThanEqual,LessThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThanEqual,Between,GreaterThanEqual
		//GreaterThanEqual,Between,GreaterThan
		//GreaterThanEqual,Between,LessThan
		//GreaterThanEqual,Between,LessThanEqual
		//GreaterThanEqual,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanEqualAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThanEqual,GreaterThanEqual
		//GreaterThan,GreaterThanEqual,GreaterThan
		//GreaterThan,GreaterThanEqual,LessThan
		//GreaterThan,GreaterThanEqual,LessThanEqual
		//GreaterThan,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,GreaterThan,GreaterThanEqual
		//GreaterThan,GreaterThan,GreaterThan
		//GreaterThan,GreaterThan,LessThan
		//GreaterThan,GreaterThan,LessThanEqual
		//GreaterThan,GreaterThan,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThan,GreaterThanEqual
		//GreaterThan,LessThan,GreaterThan
		//GreaterThan,LessThan,LessThan
		//GreaterThan,LessThan,LessThanEqual
		//GreaterThan,LessThan,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,LessThanEqual,GreaterThanEqual
		//GreaterThan,LessThanEqual,GreaterThan
		//GreaterThan,LessThanEqual,LessThan
		//GreaterThan,LessThanEqual,LessThanEqual
		//GreaterThan,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//GreaterThan,Between,GreaterThanEqual
		//GreaterThan,Between,GreaterThan
		//GreaterThan,Between,LessThan
		//GreaterThan,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthGreaterThanAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThanEqual,GreaterThanEqual
		//LessThan,GreaterThanEqual,GreaterThan
		//LessThan,GreaterThanEqual,LessThan
		//LessThan,GreaterThanEqual,LessThanEqual
		//LessThan,GreaterThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,GreaterThan,GreaterThanEqual
		//LessThan,GreaterThan,GreaterThan
		//LessThan,GreaterThan,LessThan
		//LessThan,GreaterThan,LessThanEqual
		//LessThan,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThan,GreaterThanEqual
		//LessThan,LessThan,GreaterThan
		//LessThan,LessThan,LessThan
		//LessThan,LessThan,LessThanEqual
		//LessThan,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,LessThanEqual,GreaterThanEqual
		//LessThan,LessThanEqual,GreaterThan
		//LessThan,LessThanEqual,LessThan
		//LessThan,LessThanEqual,LessThanEqual
		//LessThan,LessThanEqual,between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThan,Between,GreaterThanEqual
		//LessThan,Between,GreaterThan
		//LessThan,Between,LessThan
		//LessThan,Between,LessThanEqual
		//LessThan,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThanEqual,GreaterThanEqual
		//LessThanEqual,GreaterThanEqual,GreaterThan
		//LessThanEqual,GreaterThanEqual,LessThan
		//LessThanEqual,GreaterThanEqual,LessThanEqual
		//LessThanEqual,GreaterThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,GreaterThan,GreaterThanEqual
		//LessThanEqual,GreaterThan,GreaterThan
		//LessThanEqual,GreaterThan,LessThan
		//LessThanEqual,GreaterThan,LessThanEqual
		//LessThanEqual,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThan,GreaterThanEqual
		//LessThanEqual,LessThan,GreaterThan
		//LessThanEqual,LessThan,LessThan
		//LessThanEqual,LessThan,LessThanEqual
		//LessThanEqual,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,LessThanEqual,GreaterThanEqual
		//LessThanEqual,LessThanEqual,GreaterThan
		//LessThanEqual,LessThanEqual,LessThan
		//LessThanEqual,LessThanEqual,LessThanEqual
		//LessThanEqual,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//LessThanEqual,Between,GreaterThanEqual
		//LessThanEqual,Between,GreaterThan
		//LessThanEqual,Between,LessThan
		//LessThanEqual,Between,LessThanEqual
		//LessThanEqual,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthLessThanEqualAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThanEqual,GreaterThanEqual
		//Between,GreaterThanEqual,GreaterThan
		//Between,GreaterThanEqual,LessThan
		//Between,GreaterThanEqual,LessThanEqual
		//Between,GreaterThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,GreaterThan,GreaterThanEqual
		//Between,GreaterThan,GreaterThan
		//Between,GreaterThan,LessThan
		//Between,GreaterThan,LessThanEqual
		//Between,GreaterThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthGreaterThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThan,GreaterThanEqual
		//Between,LessThan,GreaterThan
		//Between,LessThan,LessThan
		//Between,LessThan,LessThanEqual
		//Between,LessThan,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,LessThanEqual,GreaterThanEqual
		//Between,LessThanEqual,GreaterThan
		//Between,LessThanEqual,LessThan
		//Between,LessThanEqual,LessThanEqual
		//Between,LessThanEqual,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthLessThanEqualAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
		//Between,Between,GreaterThanEqual
		//Between,Between,GreaterThan
		//Between,Between,LessThan
		//Between,Between,LessThanEqual
		//Between,Between,Between
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftGreaterThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThan(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetweenAndDraftBetween(@Param("name") String name, @Param ("point") Point point,@Param("distance")Distance distance,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
	
	//FindBy queries with only name
	public Page<Vessel> findByNameContaining(@Param("name")String name, Pageable pageable);
	
	//Width
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqual(@Param("name") String name,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThan(@Param("name") String name,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThan(@Param("name") String name,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqual(@Param("name") String name,@Param("width") Float width, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetween(@Param("name") String name,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
			//Length
		public Page<Vessel> findByNameContainingAndLengthGreaterThanEqual(@Param("name") String name,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthGreaterThan(@Param("name") String name,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthLessThan(@Param("name") String name,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthLessThanEqual(@Param("name") String name,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndLengthBetween(@Param("name") String name,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
			//Draft
		public Page<Vessel> findByNameContainingAndDraftGreaterThanEqual(@Param("name") String name,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftGreaterThan(@Param("name") String name,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftLessThan(@Param("name") String name,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftLessThanEqual(@Param("name") String name,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndDraftBetween(@Param("name") String name,@Param("from") Float from,@Param("to") Float to, Pageable pageable);
		
		//Width and Length
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("length") Float length, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo, Pageable pageable);
		
		//Width and Draft
			//GreaterThanEqual both
			//GreaterThanEqual GreaterThan
			//GreaterThanEqual LessThan
			//GreaterThanEqual LessThanEqual
			//GreaterThanEqual between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//GreaterThan GreaterThanEqual
			//GreaterThan both
			//GreaterThan LessThan
			//GreaterThan LessThanEqual
			//GreaterThan between
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthGreaterThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThan GreaterThanEqual
			//LessThan GreaterThan
			//LessThan both
			//LessThan LessThanEqual
			//LessThan between
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//LessThanEqual GreaterThanEqual
			//LessThanEqual GreaterThan
			//LessThanEqual LessThan
			//LessThanEqual both
			//LessThanEqual between
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
		
			//Between GreaterThanEqual
			//Between GreaterThan
			//Between LessThan
			//Between LessThanEqual
			//Between both
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draft") Float draft, Pageable pageable);
		public Page<Vessel> findByNameContainingAndWidthBetweenAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom,@Param("widthTo") Float widthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
		//Length and Draft
		//GreaterThanEqual both
				//GreaterThanEqual GreaterThan
				//GreaterThanEqual LessThan
				//GreaterThanEqual LessThanEqual
				//GreaterThanEqual between
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//GreaterThan GreaterThanEqual
				//GreaterThan both
				//GreaterThan LessThan
				//GreaterThan LessThanEqual
				//GreaterThan between
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//LessThan GreaterThanEqual
				//LessThan GreaterThan
				//LessThan both
				//LessThan LessThanEqual
				//LessThan between
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//LessThanEqual GreaterThanEqual
				//LessThanEqual GreaterThan
				//LessThanEqual LessThan
				//LessThanEqual both
				//LessThanEqual between
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
				//Between GreaterThanEqual
				//Between GreaterThan
				//Between LessThan
				//Between LessThanEqual
				//Between both
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("lengthFrom") Float lengthFrom,@Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
				
		//width,length and draft
			//GreaterThanEqual, GreaterThanEqual,GreaterThanEqual
			//GreaterThanEqual,GreaterThanEqual,GreaterThan
			//GreaterThanEqual,GreaterThanEqual,LessThan
			//GreaterThanEqual,GreaterThanEqual,LessThanEqual
			//GreaterThanEqual,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThanEqual,GreaterThan,GreaterThanEqual
			//GreaterThanEqual,GreaterThan,GreaterThan
			//GreaterThanEqual,GreaterThan,LessThan
			//GreaterThanEqual,GreaterThan,LessThanEqual
			//GreaterThanEqual,GreaterThan, between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			
			//GreaterThanEqual,LessThan,GreaterThanEqual
			//GreaterThanEqual,LessThan,GreaterThan
			//GreaterThanEqual,LessThan,LessThan
			//GreaterThanEqual,LessThan,LessThanEqual,
			//GreaterThanEqual,LessThan, between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			
			//GreaterThanEqual,LessThanEqual,GreaterThanEqual
			//GreaterThanEqual,LessThanEqual,GreaterThan
			//GreaterThanEqual,LessThanEqual,LessThan
			//GreaterThanEqual,LessThanEqual,LessThanEqual
			//GreaterThanEqual,LessThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThanEqual,Between,GreaterThanEqual
			//GreaterThanEqual,Between,GreaterThan
			//GreaterThanEqual,Between,LessThan
			//GreaterThanEqual,Between,LessThanEqual
			//GreaterThanEqual,Between,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanEqualAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,GreaterThanEqual,GreaterThanEqual
			//GreaterThan,GreaterThanEqual,GreaterThan
			//GreaterThan,GreaterThanEqual,LessThan
			//GreaterThan,GreaterThanEqual,LessThanEqual
			//GreaterThan,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,GreaterThan,GreaterThanEqual
			//GreaterThan,GreaterThan,GreaterThan
			//GreaterThan,GreaterThan,LessThan
			//GreaterThan,GreaterThan,LessThanEqual
			//GreaterThan,GreaterThan,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,LessThan,GreaterThanEqual
			//GreaterThan,LessThan,GreaterThan
			//GreaterThan,LessThan,LessThan
			//GreaterThan,LessThan,LessThanEqual
			//GreaterThan,LessThan,between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,LessThanEqual,GreaterThanEqual
			//GreaterThan,LessThanEqual,GreaterThan
			//GreaterThan,LessThanEqual,LessThan
			//GreaterThan,LessThanEqual,LessThanEqual
			//GreaterThan,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//GreaterThan,Between,GreaterThanEqual
			//GreaterThan,Between,GreaterThan
			//GreaterThan,Between,LessThan
			//GreaterThan,Between,Between
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthGreaterThanAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,GreaterThanEqual,GreaterThanEqual
			//LessThan,GreaterThanEqual,GreaterThan
			//LessThan,GreaterThanEqual,LessThan
			//LessThan,GreaterThanEqual,LessThanEqual
			//LessThan,GreaterThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,GreaterThan,GreaterThanEqual
			//LessThan,GreaterThan,GreaterThan
			//LessThan,GreaterThan,LessThan
			//LessThan,GreaterThan,LessThanEqual
			//LessThan,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,LessThan,GreaterThanEqual
			//LessThan,LessThan,GreaterThan
			//LessThan,LessThan,LessThan
			//LessThan,LessThan,LessThanEqual
			//LessThan,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,LessThanEqual,GreaterThanEqual
			//LessThan,LessThanEqual,GreaterThan
			//LessThan,LessThanEqual,LessThan
			//LessThan,LessThanEqual,LessThanEqual
			//LessThan,LessThanEqual,between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThan,Between,GreaterThanEqual
			//LessThan,Between,GreaterThan
			//LessThan,Between,LessThan
			//LessThan,Between,LessThanEqual
			//LessThan,Between,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,GreaterThanEqual,GreaterThanEqual
			//LessThanEqual,GreaterThanEqual,GreaterThan
			//LessThanEqual,GreaterThanEqual,LessThan
			//LessThanEqual,GreaterThanEqual,LessThanEqual
			//LessThanEqual,GreaterThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,GreaterThan,GreaterThanEqual
			//LessThanEqual,GreaterThan,GreaterThan
			//LessThanEqual,GreaterThan,LessThan
			//LessThanEqual,GreaterThan,LessThanEqual
			//LessThanEqual,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,LessThan,GreaterThanEqual
			//LessThanEqual,LessThan,GreaterThan
			//LessThanEqual,LessThan,LessThan
			//LessThanEqual,LessThan,LessThanEqual
			//LessThanEqual,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,LessThanEqual,GreaterThanEqual
			//LessThanEqual,LessThanEqual,GreaterThan
			//LessThanEqual,LessThanEqual,LessThan
			//LessThanEqual,LessThanEqual,LessThanEqual
			//LessThanEqual,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//LessThanEqual,Between,GreaterThanEqual
			//LessThanEqual,Between,GreaterThan
			//LessThanEqual,Between,LessThan
			//LessThanEqual,Between,LessThanEqual
			//LessThanEqual,Between,Between
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthLessThanEqualAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("width") Float width,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,GreaterThanEqual,GreaterThanEqual
			//Between,GreaterThanEqual,GreaterThan
			//Between,GreaterThanEqual,LessThan
			//Between,GreaterThanEqual,LessThanEqual
			//Between,GreaterThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanEqualAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,GreaterThan,GreaterThanEqual
			//Between,GreaterThan,GreaterThan
			//Between,GreaterThan,LessThan
			//Between,GreaterThan,LessThanEqual
			//Between,GreaterThan,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthGreaterThanAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,LessThan,GreaterThanEqual
			//Between,LessThan,GreaterThan
			//Between,LessThan,LessThan
			//Between,LessThan,LessThanEqual
			//Between,LessThan,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,LessThanEqual,GreaterThanEqual
			//Between,LessThanEqual,GreaterThan
			//Between,LessThanEqual,LessThan
			//Between,LessThanEqual,LessThanEqual
			//Between,LessThanEqual,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthLessThanEqualAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("length") Float length,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
			//Between,Between,GreaterThanEqual
			//Between,Between,GreaterThan
			//Between,Between,LessThan
			//Between,Between,LessThanEqual
			//Between,Between,Between
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftGreaterThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftGreaterThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftLessThan(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draft") Float draft, Pageable pageable);
			public Page<Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftBetween(@Param("name") String name,@Param("widthFrom") Float widthFrom, @Param("widthTo") Float widthTo,@Param("lengthFrom") Float lengthFrom, @Param("lengthTo") Float lengthTo,@Param("draftFrom") Float draftFrom,@Param("draftTo") Float draftTo, Pageable pageable);
			
	
}
