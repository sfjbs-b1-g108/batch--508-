package com.chandra.students;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentController {
	@Autowired
	StudentService service;
	@GetMapping("/all")
	List<Student> getAllStudent(){
		return (List<Student>) getAllStudent();		
	}
	@GetMapping("/{id}")
	Optional<Student> getStudentById(@PathVariable Integer Id, Student id){
		return service.getStudentById(id);
	}
	

}