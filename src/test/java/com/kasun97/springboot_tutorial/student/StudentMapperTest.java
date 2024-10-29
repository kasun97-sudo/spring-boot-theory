package com.kasun97.springboot_tutorial.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("inside before all method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("inside before each method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("inside after each method");
    }

    @Test
    public void testMethod1(){
        System.out.println("my first test method");
    }

    @Test
    public void testMethod2(){
        System.out.println("my second test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("inside after all method");
    }
}