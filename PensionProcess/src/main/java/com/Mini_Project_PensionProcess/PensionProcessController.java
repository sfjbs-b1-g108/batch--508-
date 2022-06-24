package com.Mini_Project_PensionProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/PensionProcess")
public class PensionProcessController {
@Autowired
	PensionProcessService service;
	
@GetMapping("/All")	
Iterable<PensionProcess> getAllPensionDetails(){
	return service.getAllPensionProcess();	
}
@GetMapping("/{Id}")
Iterable<PensionProcess> getpensionDetilsById(@PathVariable Integer Id){
	return service.getAllPensionProcess();
	
}
}
