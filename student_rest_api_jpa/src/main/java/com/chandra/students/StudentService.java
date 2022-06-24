package com.chandra.students;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	
	StudentRepository service ;
	
	List<Student> getAllStudent(){
		return (List<Student>) getAllStudent();		
	}
	
	 Optional<Student> getStudentById(Student Id){
		return service.findById(Id);
	}

	
	

	
	
		
		
	
	
	

}
