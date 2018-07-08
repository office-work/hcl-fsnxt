package org.db.com.controller;

import java.util.List;

import org.db.com.dto.StudentDto;
import org.db.com.rest.service.StudentRestService;
import org.db.com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController implements StudentRestService {

	@Autowired
	StudentService studentService;

	@Override
	public void createStudent(StudentDto studentDto) {
		studentService.save(studentDto);
	}

	@Override
	public void sayHello() {
		System.out.println("hello arpit");
		
	}

	@Override
	public List<StudentDto> getAllStudents() {
		return studentService.getAllStudents();
	}

}
