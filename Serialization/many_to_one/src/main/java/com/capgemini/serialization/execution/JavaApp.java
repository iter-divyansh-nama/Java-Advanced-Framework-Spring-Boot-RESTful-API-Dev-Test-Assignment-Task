package com.capgemini.serialization.execution;

import java.io.IOException;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp {

    public static void execution() {

        System.out.println("🚀 Starting Application...\n");

        FileHandler fileHandler = new FileHandler();

        try {
            fileHandler.createTheFile();
            fileHandler.serialization();
            fileHandler.deserialization();

            System.out.println("\n✅ Execution Completed Successfully!");

        } catch (IOException e) {
            System.err.println("❌ Error occurred:");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        execution();
    }
}