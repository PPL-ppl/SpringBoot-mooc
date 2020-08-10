package com.mooc.demo.controll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllTest {
    @BeforeEach
    void setUp() {
        System.out.println("1");
    }

    @AfterEach
    void tearDown() {
        System.out.println("2");
    }
    @Test
    void tes(){

    }
}