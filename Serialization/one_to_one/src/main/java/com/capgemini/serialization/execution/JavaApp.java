package com.capgemini.serialization.execution;

import java.io.IOException;

import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp {

    public static void execution() {

        System.out.println("🚀 Starting Application...\n");

        // Create FileHandler object
        FileHandler fileHandler = new FileHandler();

        try {
            // Step 1: Create JSON File
            fileHandler.createTheFile();

            // Step 2: Serialize (Student + Project)
            fileHandler.serialization();

            // Step 3: Deserialize
            fileHandler.deserialization();

            System.out.println("\n✅ Execution Completed Successfully!");

        } catch (IOException e) {
            System.err.println("❌ Error occurred:");
            e.printStackTrace();
        }
    }
}