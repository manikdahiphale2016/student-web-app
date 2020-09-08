package com.manikit.student.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manikit.student.studentdal.entities.Student;
import com.manikit.student.studentdal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Doe");
		student.setCourse("SpringCloud in Action");
		student.setFee(8000D);
		
		studentRepository.save(student);
	}
	
	@Test
	public void tesFindStudentById() {
		Student student =  studentRepository.findById(1L).get();
		System.out.println(student);
	}
	

	@Test
	public void tesUpdateById() {
		Student student =  studentRepository.findById(1L).get();
		student.setFee(1000d);
		
		studentRepository.save(student);
	}
	

	@Test
	public void tesDeleteById() {
		Student student =  studentRepository.findById(1L).get();
		if(student != null) {
			studentRepository.delete(student);
		}
		else {
			System.out.println("Data not available!");
		}
	}
}
