package com.manikit.student.studentdal.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikit.student.studentdal.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
