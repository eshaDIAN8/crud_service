package com.citi.converter.serviceImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citi.converter.model.Convert;
import com.citi.converter.repository.ConvertRepo;
import com.citi.converter.service.ConvertService;


@Component
public class LengthConverterServiceImpl implements ConvertService {
	
	@Autowired
	ConvertRepo repo;
	

	
	 

	
	@Override
	public String findByKeyData(String convertedUnit) {
		// TODO Auto-generated method stub
		String formula = repo.findByKey(convertedUnit);
		return formula;
	}

	
}
