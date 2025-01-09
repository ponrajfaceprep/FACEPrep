package org.example;

public class Dev {
    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public Dev(int age) {
        this.age = age;
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }
    public void build () {
        laptop.compile();
        System.out.println("Working on Awesome project");
    }
}
