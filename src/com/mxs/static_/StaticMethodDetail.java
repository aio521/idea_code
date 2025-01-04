package com.mxs.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

        D.test();
    }
}

class D {
    private int n1 = 111;
    private static int n2 = 222;

    //非静态方法
    public void say() {
        System.out.println("say()");
    }

    //静态方法/类方法
    //类方法中不允许使用和对象有关的关键字，
    //比如this或者super。普通方法（非静态方法/成员方法）可以。
    public static void hi() {
//        System.out.println(this.n1);
        System.out.println("hi()");
    }

    //类方法（静态方法）中，只能访问静态变量或者静态方法。【如何理解？】
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        System.out.println("test");
//        System.out.println(this.n2);//不允许许使用和对象有关的关键字

        //静态方法可以调用静态方法
        //但是不能调用非静态方法
        hi();
        //say();//非静态方法不能再静态方法中调用
    }

    /*非静态方法可以访问静态成员和非静态成员*/
    public void ok() {

        System.out.println(this.n1);//非静态属性
        say();//非静态方法

        System.out.println(n2);//静态属性
        hi();//静态方法
    }

    public static void test() {
        D d = new D();
        d.hello();
        d.say();
    }
}