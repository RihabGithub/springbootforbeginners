package com.rihab.produits.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;


public interface StudentService {
	
	
Student save(Student s);	
	
List<Student> findAllStudents();

Student findByEmail(String email);


Student update(Student s);

void delete(String email);




}
