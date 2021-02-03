package at.muellner.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.muellner.dependencyinjection.services.impl.GreetingServiceImpl;

class PropertyInjectedControllerTest
{
    // property based dependency injection should be avoided!
    PropertyInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting()
    {
        System.out.println("################### MANUAL DEPENDENCY INJECTION");
        System.out.println("PropertyInjectedControllerTest: " + controller.getGreeting());
    }
}
