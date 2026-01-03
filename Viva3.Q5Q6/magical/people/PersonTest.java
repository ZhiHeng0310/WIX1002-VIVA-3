package com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
        Person student1 = new Person();

        try {
            Person student2 = new Person("Jeff", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }

        Person student3 = new Person("Hong Han", 22);
        Person student4 = new Person("Zhe Heng", 22);
        Person student5 = new Person ("Zhe Heng", 21);
        Person student6 = new Person ("Hong Han", 22);
//        Person student7 = new Person (null, 22);

        // Validate Age
        System.out.println("\nTesting Age Validation:");
        try {
            student1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Age Input: " + e.getMessage());
        }

        // Call compareTo() and output results
        System.out.println("\nTesting Comparisons:");
        System.out.println(student3.compareTo(student6));
        System.out.println(student4.compareTo(student5));
        System.out.println(student4.compareTo(student6));

//        try {
//            System.out.println(student3.compareTo(null));
//        } catch (Exception e) {
//            System.out.println("Student cannot be null.");
//        }
//
//        System.out.println(student4.compareTo(student7));

        // Requirement: Verify total person count
        System.out.println("\nVerifying Academy Records:");
        System.out.println("Total Person count: " + Person.getPersonCount());
    }
}