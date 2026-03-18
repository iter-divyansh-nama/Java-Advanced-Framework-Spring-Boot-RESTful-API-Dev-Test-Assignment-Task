package com.capgemini.serialization.filehandler;

import java.io.File;
import java.io.IOException;

import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.entity.Project;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class FileHandler {   // ✅ MUST match file name exactly

    private static final String PATH = "src/main/resources/Student.json";
    private static final File FILE = new File(PATH);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT);

    // ✅ Create File
    public void createTheFile() throws IOException {
        if (FILE.createNewFile()) {
            System.out.println("JSON File Created Successfully ✅");
        } else {
            System.out.println("JSON File Already Exists ⚠️");
        }
    }

    // ✅ Serialization (One-to-One)
    public void serialization() throws IOException {

        // Create Project object
        Project project = new Project(101, "AI System");

        // Student HAS-A Project (One-to-One)
        Student student = new Student(
                1,
                "Raja",
                "raja@gmail.com",
                9876543210L,
                project
        );

        OBJECT_MAPPER.writeValue(FILE, student);

        System.out.println("Serialization Done Successfully ✅");
    }

    // ✅ Deserialization
    public void deserialization() throws IOException {

        if (!FILE.exists()) {
            System.out.println("File not found ❌");
            return;
        }

        Student student = OBJECT_MAPPER.readValue(FILE, Student.class);

        System.out.println(student);
        System.out.println("Deserialization Done Successfully ✅");
    }

    // ✅ Delete File (optional)
    public void deleteTheFile() {
        if (FILE.exists() && FILE.delete()) {
            System.out.println("JSON File Deleted Successfully 🗑️");
        } else {
            System.out.println("JSON File Doesn't Exist ❌");
        }
    }
}