package com.mxs.static_;

public class StaticExercise03 {
}

class Persons {
    private int id;
    private static int total = 0;

    public static void setTotalPerson(int total) {
//        this.total = total;
        Persons.total = total;/*修改*/
    }

    public Persons() {
        total++;//3
        id = total;
    }
    /*输出值*/
    public static void printInfo() {
        System.out.println("total:" + total );
    }
}

class TestPerson{
    public static void main(String[] args) {
        Persons.setTotalPerson(3);
        new Persons();
        Persons.printInfo();
    }
}