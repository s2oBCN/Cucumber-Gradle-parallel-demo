package com.example.cucumber.gradle.parallel.demo;

import io.cucumber.java.Before;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration(classes = DemoApplication.class, loader = SpringBootContextLoader.class)
//@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@SpringBootTest
public class CreateContextHook {
    @Before
    public void setupCucumberSpringContext() {
        // Dummy method so cucumber will recognize this class and use its context configurations.
    }
}
