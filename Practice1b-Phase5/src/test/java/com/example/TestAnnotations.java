package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnnotations {
    
    @BeforeClass
    public void setUp() {
        System.out.println("Before Class: Setting up test environment...");
        // Add code for setting up test environment
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1: Executing test...");
        // Add code for test method 1
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2: Executing test...");
        // Add code for test method 2
    }

    @AfterClass
    public void tearDown() {
        System.out.println("After Class: Cleaning up test environment...");
        // Add code for cleaning up test environment
    }
}
