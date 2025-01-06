package com.mxs.codeblock;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total="+Person.total);//100 in static block
        System.out.println("total="+Person.total);//100 in static block
    }
}

class Person{
    public static int total;
    static {
        total=100;
        System.out.println("in static block");
    }
}
