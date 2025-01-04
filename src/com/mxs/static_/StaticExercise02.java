package com.mxs.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person.getTotalPerson());
        Person person = new Person();
        System.out.println("Number of total is " + Person.getTotalPerson());
    }
}

class Person {
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
//        id++;
        return total;
    }

    public Person() {
        total++;
        id = total;
    }
}
