package org.example;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Dev obj = (Dev) context.getBean("dev");
//        obj.build();
    }
}