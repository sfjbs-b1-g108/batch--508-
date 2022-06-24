package com.Mini_Project_PensionProcess;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PensionProcessService {

@Autowired
	PensionProcessRepository repo;
		
Iterable<PensionProcess> getAllPensionProcess(){
	return repo.findAll();
}

Optional<PensionProcess> getPensionsprocess(PensionProcess Id) {
	return repo.findById(Id.getId());
	
}
	
		
		

	
}
