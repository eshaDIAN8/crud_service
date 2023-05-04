package com.citi.converter.serviceImpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.citi.converter.repository.ConvertRepo;
import com.citi.converter.service.ConvertService;


@Service
public class LengthConverterServiceImpl implements ConvertService {
	
	@Autowired
	ConvertRepo repo;
	

	
	 

	
	@Override
	public String findByKey(String convertedUnit) {
		System.out.println("convertedUnit::"+convertedUnit);
		// TODO Auto-generated method stub
		String formula = repo.findByName(convertedUnit);
		System.out.println("in crud service impl ::"+formula);
		return formula;
	}

	
}
