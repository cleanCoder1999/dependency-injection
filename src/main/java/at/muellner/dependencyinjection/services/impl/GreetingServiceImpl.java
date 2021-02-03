package at.muellner.dependencyinjection.services.impl;

import org.springframework.stereotype.Service;

import at.muellner.dependencyinjection.services.api.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World!";
    }
}
