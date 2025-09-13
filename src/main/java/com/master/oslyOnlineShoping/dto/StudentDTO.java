package com.master.oslyOnlineShoping.dto;

public class StudentDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String parentContactInfo;
    private String grade;
    private String dateOfBirth;

    public StudentDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getParentContactInfo() {
        return parentContactInfo;
    }

    public void setParentContactInfo(String parentContactInfo) {
        this.parentContactInfo = parentContactInfo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parentContactInfo='" + parentContactInfo + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
