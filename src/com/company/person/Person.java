package com.company.person;

public abstract class Person {
    public int age;
    public String fullname;

    public Person(int age, String fullname) {
        this.age = age;
        this.fullname = fullname;
    }

    public abstract String toString();
}
