package com.leaning.oop;

public class Dog { //all ines -> immutable

    static final String TOP_NAME = "Sharik";

    protected final String name; //properties
    private int age;

    public Dog(String name) { //Dog, [String]
        this.name = name;
    }

//    public Dog() {
//        this.name = TOP_NAME;
//    }

    public void talk() {
        System.out.println(name + " : woof");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
