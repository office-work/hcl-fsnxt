package org.db.com.service;

import java.util.List;

import org.db.com.dto.StudentDto;

public interface StudentService {

	public void save(StudentDto studentDto);
	public List<StudentDto> getAllStudents();
}
