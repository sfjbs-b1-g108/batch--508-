package com.PensionManagment;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PensionerDetailsService {
	
	@Autowired
	PensionDetailsRepository repo;
	public PensionDetails findById;
	
	Iterable<PensionDetails> getAllPensionDetails(){
		return repo.findAll();
		
	}
	
	Iterable<PensionDetails> getPensionDetailsById(Integer Id) {
	return repo.findAll();}

	public PensionDetails findById(Integer id) {
		
		return null;
	}

	public Optional<PensionDetails> findById(PensionDetails id) {
		return null;
	}


	
	
}