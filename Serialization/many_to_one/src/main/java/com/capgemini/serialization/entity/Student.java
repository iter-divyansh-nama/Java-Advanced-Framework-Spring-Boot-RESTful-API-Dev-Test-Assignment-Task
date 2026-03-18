package com.capgemini.serialization.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private int studentId;
    private String studentName;
    private String email;
    private long phone;

    // 🔗 MANY-TO-ONE ASSOCIATION
    private Project project;

    public Student() {}

    public Student(int studentId, String studentName, String email, long phone, Project project) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.project = project;
    }

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId +
                ", Name=" + studentName +
                ", Email=" + email +
                ", Phone=" + phone +
                ", " + project + "]";
    }
}