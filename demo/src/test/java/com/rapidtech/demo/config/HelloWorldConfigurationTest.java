package com.rapidtech.demo.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldConfigurationTest {
    @Test
    void applicationContextTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        Assertions.assertNotNull(context);
    }
}