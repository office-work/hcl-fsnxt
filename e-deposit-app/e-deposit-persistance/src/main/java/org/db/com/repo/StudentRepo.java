package org.db.com.repo;

import org.db.com.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Long> {

}
