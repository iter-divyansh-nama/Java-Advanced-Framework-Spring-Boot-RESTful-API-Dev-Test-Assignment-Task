package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private int studentId;
    private String studentName;
    private String email;
    private long phone;

    // 🔗 ONE-TO-MANY ASSOCIATION
    private List<Project> projects;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(int studentId, String studentName, String email, long phone, List<Project> projects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.projects = projects;
    }

    // Getters & Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId +
                ", Name=" + studentName +
                ", Email=" + email +
                ", Phone=" + phone +
                ", Projects=" + projects + "]";
    }
}