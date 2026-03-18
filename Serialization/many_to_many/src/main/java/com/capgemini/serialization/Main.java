package com.capgemini.serialization;

import com.capgemini.serialization.execution.JavaApp;  // ✅ FIXED

public class Main {

    public static void main(String[] args) {
        JavaApp.execution();   // ✅ works now
    }
}