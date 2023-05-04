package com.citi.converter.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.converter.model.Convert;
import com.citi.converter.repository.ConvertRepo;
import com.citi.converter.service.ConvertService;

@RestController
@RequestMapping("/getConvertedUnit")
public class ConvertController {
	
	@Autowired
	ConvertService convertService ;
	
	

	@Autowired
	ConvertRepo convertRepo;
	

	
	@GetMapping("/{convertedUnit}")
	public  ResponseEntity<String> getConvertedUnitFromFrontService( @PathVariable String convertedUnit) {
		
		String getformula = convertService.findByKey(convertedUnit);
			System.out.println("getformula::"+getformula);
		//return convertRepo.findByUnit(fromUnit,toUnit);
		return ResponseEntity.ok(getformula);
	}

}
