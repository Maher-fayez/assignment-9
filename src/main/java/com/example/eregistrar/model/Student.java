package com.example.eregistrar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long studentId;
    @Column(nullable = false, unique = true)
    private String studentNumber;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private double cgpa;
    private String dateOfEnrollment;


    public Student(String studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, String dateOfEnrollment) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Student() {

    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
