package com.chandra.students;

import java.util.Optional;

import org.springframework.stereotype.Repository;
@Repository
public class StudentRepository extends CrudRepositor <Student,Integer>{

	public Optional<Student> findById(Student id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
