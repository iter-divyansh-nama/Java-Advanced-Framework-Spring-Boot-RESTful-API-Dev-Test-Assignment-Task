package com.capgemini.serialization.filehandler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileHandler {

    private static final String FILE_PATH = "student.json";

    // Step 1: Create File
    public void createTheFile() throws IOException {
        File file = new File(FILE_PATH);

        if (file.createNewFile()) {
            System.out.println("📁 File created: " + FILE_PATH);
        } else {
            System.out.println("📁 File already exists");
        }
    }

    // Step 2: Serialization
    public void serialization() throws IOException {

        // Create multiple projects
        Project p1 = new Project(101, "Banking System");
        Project p2 = new Project(102, "E-Commerce App");
        Project p3 = new Project(103, "Chat Application");

        // Add to list
        List<Project> projectList = Arrays.asList(p1, p2, p3);

        // Create student with multiple projects
        Student student = new Student(
                1,
                "Rahul",
                "rahul@gmail.com",
                9876543210L,
                projectList
        );

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_PATH), student);

        System.out.println("✅ Serialization Done!");
    }

    // Step 3: Deserialization
    public void deserialization() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Student student = mapper.readValue(new File(FILE_PATH), Student.class);

        System.out.println("\n📥 Deserialized Data:");
        System.out.println(student);
    }
}