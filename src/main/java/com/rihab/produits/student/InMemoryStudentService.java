package com.rihab.produits.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class InMemoryStudentService implements StudentService {

	private final InMemoryStudentDao dao;
	
	
	
	
	
	
	public InMemoryStudentService(InMemoryStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
	return this.dao.findAllStudents();
				
	}

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return this.dao.save(s);
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.dao.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return dao.update(s);
	}

	@Override
	public void delete(String email) {
		dao.delete(email);
		
	}

}
