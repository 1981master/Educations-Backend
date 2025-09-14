package com.master.oslyOnlineShoping.controller;

import com.master.oslyOnlineShoping.entity.school.Student;
import com.master.oslyOnlineShoping.dto.StudentDTO;
import com.master.oslyOnlineShoping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
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

    @RequestMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public StudentDTO updateStudent(@PathVariable Long id, @RequestBody StudentDTO studentDto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setParentContactInfo(studentDto.getParentContactInfo());
        student.setGrade(studentDto.getGrade());
        student.setDateOfBirth(LocalDate.parse(studentDto.getDateOfBirth()));

        Student updated = studentRepository.save(student);

        StudentDTO response = new StudentDTO();
        response.setId(updated.getStudentId());
        response.setFirstName(updated.getFirstName());
        response.setLastName(updated.getLastName());
        response.setParentContactInfo(updated.getParentContactInfo());
        response.setGrade(updated.getGrade());
        response.setDateOfBirth(updated.getDateOfBirth().toString());

        return response;
    }


}
