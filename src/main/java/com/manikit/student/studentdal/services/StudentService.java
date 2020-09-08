package com.manikit.student.studentdal.services;

import java.util.List;

import com.manikit.student.studentdal.entities.Student;

public interface StudentService {

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	Student getStudentById(Long id);

	void deleteStudent(Student student);

	void deleteStudentById(Long id);

	List<Student> getAllStudent();

}
