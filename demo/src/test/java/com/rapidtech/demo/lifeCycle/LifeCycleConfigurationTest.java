package com.rapidtech.demo.lifeCycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LifeCycleConfigurationTest {
    private ConfigurableApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void lifeCycleTest() {
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void serverTest() {
        Server server = context.getBean(Server.class);
    }

}