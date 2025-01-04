package com.mxs.static_;

public class StaticExercise03 {
}

class Person {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
//        this.total = total;
        Person.total = total;
    }

    public Person() {
        total++;//3
        id = total;
    }
}

class TestPerson{
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
    }
}