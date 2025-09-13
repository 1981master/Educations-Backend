package com.master.oslyOnlineShoping.entity.school;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String firstName;
    private String lastName;
    private String parentContactInfo;
    private String grade;
    private LocalDate dateOfBirth;

    // Getters and setters
    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getParentContactInfo() { return parentContactInfo; }
    public void setParentContactInfo(String parentContactInfo) { this.parentContactInfo = parentContactInfo; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parentContactInfo='" + parentContactInfo + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
