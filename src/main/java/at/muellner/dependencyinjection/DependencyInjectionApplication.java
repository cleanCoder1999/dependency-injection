package at.muellner.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import at.muellner.dependencyinjection.controllers.ConstructorInjectedController;
import at.muellner.dependencyinjection.controllers.MyController;
import at.muellner.dependencyinjection.controllers.PropertyInjectedController;
import at.muellner.dependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");

        String greeting = myController.sayHey();
        System.out.println(greeting);

        System.out.println("################### DEPENDENCY INJECTION USING SPRING FRAMEWORK");

        System.out.println("----------------- Property");
        PropertyInjectedController propertyInjectedController =
            (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------------- Setter");
        SetterInjectedController setterInjectedController =
            (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------------- Constructor");
        ConstructorInjectedController constructorInjectedController =
            (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
