package org.example;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Dev dev = context.getBean(Dev.class);
        dev.build();
        System.out.println( "Hello World!" );
    }
}
