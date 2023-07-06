package com.rihab.produits.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;


@Repository
public class InMemoryStudentDao  {

	
	private final  List<Student> STUDENTS = new ArrayList<>();

	public Student save(Student s) {
		// TODO Auto-generated method stub
		 STUDENTS.add(s);
		 return s;
	}
	
	public List<Student> findAllStudents(){
		return STUDENTS;
	}
	
	
	

	
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return STUDENTS.stream()
				.filter(s -> email.equals(s.getEmail()))
				.findFirst()
				.orElse(null);
	}

	
	public Student update(Student s) {
		// TODO Auto-generated method stub
		
		var studentIndex = IntStream.range(0, STUDENTS.size())
				.filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
				.findFirst()
				.orElse(-1);
		
		if(studentIndex > -1) {
			STUDENTS.set(studentIndex, s);
			return s;
		}
		
		return null;
	}

	
	public void delete(String email) {
		var student = findByEmail(email);
		
		if(student != null) {
			STUDENTS.remove(student);
		}
	}
			

}
