package at.muellner.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import at.muellner.dependencyinjection.services.api.GreetingService;

@Controller
public class PropertyInjectedController
{
    @Autowired
    public  GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
