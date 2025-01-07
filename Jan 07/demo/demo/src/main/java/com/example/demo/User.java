package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired // Field injection
    @Qualifier("laptop")
    Computer comp;

    // Constructor injection
//    User(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    @Autowired
//    void setComp(Computer comp) {
//        this.comp = comp;
//    }

    public void sayHi() {
        System.out.println("Hi");
        comp.compile();
    }
}
