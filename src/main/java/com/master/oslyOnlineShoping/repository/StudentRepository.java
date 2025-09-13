package com.master.oslyOnlineShoping.repository;

import com.master.oslyOnlineShoping.entity.school.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}
