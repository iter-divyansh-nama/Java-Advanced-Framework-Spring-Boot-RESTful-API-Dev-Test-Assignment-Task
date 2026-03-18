package com.capgemini.serialization.entity;

import java.io.Serializable;

public class Project implements Serializable {

    private int projectId;
    private String projectName;

    // Default constructor
    public Project() {}

    // Parameterized constructor
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

    @Override
    public String toString() {
        return "Project [ID=" + projectId + ", Name=" + projectName + "]";
    }
}