package com.magical.people;

public class Person {
    // Instance Variables (Encapsulated)
    private String name;
    private int age;
    private static final int DEFAULT_AGE = 18;
    private static int personCount = 0;

    // No-argument constructor
    public Person() {
        this.name = "Unknown Student";
        this.age = DEFAULT_AGE;
        personCount++;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age);
        personCount++;
    }

    // Encapsulation Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public boolean compareTo(Person other) {
        return this.name.equals(other.name) && this.age == other.age;
    }
}

