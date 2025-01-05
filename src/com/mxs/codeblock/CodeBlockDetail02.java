package com.mxs.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

        A a = new A();

    }
}

class A {
    //普通属性初始化
    private int n2 = getN2();

    //普通代码块
    {
        System.out.println("A的普通代码块被执行");
    }

    //普通方法
    public int getN2() {
        System.out.println("A的getN2()方法被调用");
        return 200;
    }

    //静态属性初始化
    private static int n1 = getN1();

    //静态代码块
    static {
        System.out.println("A的静态代码块被执行");
    }

    //静态方法
    public static int getN1() {
        System.out.println("A的静态方法getN1()被调用");
        return 100;
    }

    public A() {
        System.out.println("A的构造器被执行");
    }
}