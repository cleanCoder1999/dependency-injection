package at.muellner.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String sayHey()
    {
        System.out.println("Hello World!");

        return "Hey";
    }
}
