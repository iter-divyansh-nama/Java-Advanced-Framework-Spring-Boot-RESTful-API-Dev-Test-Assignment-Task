package com.capgemini.serialization.filehandler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileHandler {

	private static final String FILE_PATH = "src/main/resources/Student.json";

    public void createTheFile() throws IOException {
        File file = new File(FILE_PATH);

        if (file.createNewFile()) {
            System.out.println("📁 File created: " + FILE_PATH);
        } else {
            System.out.println("📁 File already exists");
        }
    }

    // 🔥 MANY-TO-MANY
    public void serialization() throws IOException {

        // Create projects
        Project p1 = new Project(101, "Banking System");
        Project p2 = new Project(102, "AI System");
        Project p3 = new Project(103, "E-Commerce");

        // Create students with multiple projects
        Student s1 = new Student(1, "Rahul", "rahul@gmail.com", 9876543210L, Arrays.asList(p1, p2));
        Student s2 = new Student(2, "Amit", "amit@gmail.com", 9876543211L, Arrays.asList(p1, p3));
        Student s3 = new Student(3, "Neha", "neha@gmail.com", 9876543212L, Arrays.asList(p2, p3));

        List<Student> students = Arrays.asList(s1, s2, s3);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_PATH), students);

        System.out.println("✅ Serialization Done!");
    }

    public void deserialization() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Student[] students = mapper.readValue(new File(FILE_PATH), Student[].class);

        System.out.println("\n📥 Deserialized Data:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}