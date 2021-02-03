package at.muellner.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

import at.muellner.dependencyinjection.services.api.GreetingService;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    public ConstructorInjectedController(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
