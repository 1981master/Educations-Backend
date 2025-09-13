package com.master.oslyOnlineShoping.controller;

import com.master.oslyOnlineShoping.entity.school.Student;
import com.master.oslyOnlineShoping.dto.StudentDTO;
import com.master.oslyOnlineShoping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDto) {
        Student student = new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setParentContactInfo(studentDto.getParentContactInfo());
        student.setGrade(studentDto.getGrade());
        student.setDateOfBirth(LocalDate.parse(studentDto.getDateOfBirth()));

        Student saved = studentRepository.save(student);

        // Map back to DTO
        StudentDTO response = new StudentDTO();
        response.setId(saved.getStudentId());
        response.setFirstName(saved.getFirstName());
        response.setLastName(saved.getLastName());
        response.setParentContactInfo(saved.getParentContactInfo());
        response.setGrade(saved.getGrade());
        response.setDateOfBirth(saved.getDateOfBirth().toString());

        return response;
    }
    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

}
