package com.capgemini.serialization.entity;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable {

    private int projectId;
    private String projectName;

    // 🔗 MANY-TO-MANY (optional reverse mapping)
    private List<Student> students;

    public Project() {}

    public Project(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    // Getters & Setters
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Project [ID=" + projectId + ", Name=" + projectName + "]";
    }
}