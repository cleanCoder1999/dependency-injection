package at.muellner.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.muellner.dependencyinjection.services.impl.GreetingServiceImpl;

class SetterInjectedControllerTest
{
    // setter-based dependency injection is okay; however, it is not the most preferred method
    // --> requires more code than constructor-based di; property cannot be declared as final
    SetterInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting()
    {
        System.out.println("################### MANUAL DEPENDENCY INJECTION");
        System.out.println("SetterInjectedController: " + controller.getGreeting());;
    }
}
