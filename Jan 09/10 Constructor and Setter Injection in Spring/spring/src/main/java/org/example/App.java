package org.example;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

//        // Setter Injection
//        Dev obj = (Dev) context.getBean("dev");
////        obj.setAge(18);
//        System.out.println(obj.getAge());
//
//        // Constructor Injection
//        Dev obj1 = (Dev) context.getBean("dev1");
//        System.out.println(obj1.getAge());
//
//        // Constructor Injection with two parameters
//        Laptop obj2 = (Laptop) context.getBean("laptop");
//        System.out.println(obj2.getBrand() + " " + obj2.getModel());

        Dev obj = (Dev) context.getBean("dev");
        obj.build();

    }
}