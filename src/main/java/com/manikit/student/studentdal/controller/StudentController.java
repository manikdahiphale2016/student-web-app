package com.manikit.student.studentdal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manikit.student.studentdal.entities.Student;
import com.manikit.student.studentdal.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/showStudent")
	public String createStudent() {
		
		return "createStudent";
	}

	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student,ModelMap modelMap) {
		Student savedStudent = studentService.saveStudent(student);
		String msg = "Student saved with ID: "+ savedStudent.getId();
		modelMap.addAttribute("msg", msg);
		
		return "createStudent";
	}
	
	@RequestMapping("/displayAll")
	public String displayAllStudent(ModelMap modelMap) {
		
		List<Student> allStudent = studentService.getAllStudent();
		modelMap.addAttribute("students", allStudent);
		
		return "displayStudents";
	}
	
	@RequestMapping("/editStudent{id}")
	public String editStudentById(@RequestParam("id") Long id,ModelMap modelMap) {
		Student student = studentService.getStudentById(id);
		
		modelMap.addAttribute("student", student);	
		
		return "editStudent";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute("student") Student student,ModelMap modelMap) {
		
		Student updatedStudent = studentService.updateStudent(student);
		String updatedMsg = "Updated Successfully with ID: "+ updatedStudent.getId();
		modelMap.addAttribute("updatedMsg", updatedMsg);
		
		return displayAllStudent(modelMap);
	}
	
	@RequestMapping("/deleteStudent{id}")
	public String deleteStudentById(@RequestParam("id") Long id, ModelMap modelMap) {
		studentService.deleteStudentById(id);
		String deletedMsg ="Student Deleted Successfully.!";
		modelMap.addAttribute("deleteMsg",deletedMsg);
		
		return  displayAllStudent(modelMap);
	}
}
