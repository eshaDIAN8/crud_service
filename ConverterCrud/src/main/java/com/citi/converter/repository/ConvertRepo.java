package com.citi.converter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.citi.converter.model.Convert;


public interface ConvertRepo extends JpaRepository<Convert, Double>{

	//@Query("select formula from e where convertedUnit:=convertedUnit")
	String findByKey(String convertedUnit);

	

	
	


	

}
