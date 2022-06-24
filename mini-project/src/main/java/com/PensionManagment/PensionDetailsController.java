package com.PensionManagment;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PensionDetails")
public class PensionDetailsController {
	@Autowired
	PensionerDetailsService service;

@GetMapping("/{Id}")
Iterable<PensionDetails> getpensionDetilsById(@PathVariable Integer Id){
	return service.getAllPensionDetails();
	
}@GetMapping("/All")	
Iterable<PensionDetails> getAllPensionDetails(){
	return service.getAllPensionDetails();	
}
}
