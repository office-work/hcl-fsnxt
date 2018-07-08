package org.db.com.rest.service;


import java.util.List;

import org.db.com.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public abstract interface StudentRestService {

	@PostMapping
	public abstract void createStudent(StudentDto studentDto);
	
	@GetMapping
	public abstract List<StudentDto> getAllStudents();
	
	
	@GetMapping(value="/test")
	public abstract void sayHello();
	
}
