package com.manikit.student.studentdal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikit.student.studentdal.entities.Student;
import com.manikit.student.studentdal.repos.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return getStudentRepository().save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return  getStudentRepository().save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return getStudentRepository().getOne(id);
	}

	@Override
	public void deleteStudent(Student student) {
		Student student2 = getStudentById(student.getId());
		
		getStudentRepository().delete(student2);
	}

	@Override
	public void deleteStudentById(Long id) {
		getStudentRepository().deleteById(id);
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return getStudentRepository().findAll();
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
