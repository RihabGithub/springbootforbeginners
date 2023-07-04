package com.rihab.produits.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> findAllStudents(){
		return List.of(
				new Student(
				"Rihab",
				"Mega",
				LocalDate.now(),
				"conatct@gmail.com",
				26),
				new Student(
						"Rihab",
						"Roro",
						LocalDate.now(),
						"conatct@gmail.com",
						30),
				new Student(
						"Hamma",
						"Hamma",
						LocalDate.now(),
						"conatct@gmail.com",
						27)
				
				
				
				);
				
	}
}
