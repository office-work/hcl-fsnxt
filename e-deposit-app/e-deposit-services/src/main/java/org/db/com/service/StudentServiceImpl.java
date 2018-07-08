package org.db.com.service;

import java.util.ArrayList;
import java.util.List;

import org.db.com.dto.StudentDto;
import org.db.com.entity.Student;
import org.db.com.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public void save(StudentDto studentDto) {
		Student student = new Student();
		student.setId(studentDto.getId());
		student.setName(studentDto.getName());
		student.setAddress(studentDto.getAddress());
		studentRepo.save(student);
	}

	@Override
	public List<StudentDto> getAllStudents() {
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		List<Student> studens = studentRepo.findAll();
		if (!studens.isEmpty()) {
			for (Student student : studens) {
				StudentDto dto = new StudentDto();
				dto.setId(student.getId());
				dto.setName(student.getName());
				dto.setAddress(student.getAddress());

				studentDtoList.add(dto);
			}
		}
		return studentDtoList;
	}

}
