package at.muellner.dependencyinjection.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.muellner.dependencyinjection.services.impl.GreetingServiceImpl;

class ConstructorInjectedControllerTest
{
    // constructor-based dependency injection is the most preferred methodology
    // --> requires less code than setter-based di; property can be declared as final
    // --> most simple and clean implementation
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting()
    {
        System.out.println("################### MANUAL DEPENDENCY INJECTION");
        System.out.println("ConstructorInjectedController: " + controller.getGreeting());
    }
}
