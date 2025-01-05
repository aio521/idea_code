package com.mxs.main_;

public class Main01 {
    //静态的变量/属性
    private static String str = "hello world";

    //静态方法
    public static void hi() {
        System.out.println("hi, Main01's static method hi()!");
    }

    //非静态的属性
    private int n1 = 100;

    //非静态的方法
    public void cry() {
        System.out.println("cry, Main01's non-static method cry()!");
    }

    public static void main(String[] args) {

        //1.静态方法main可以直接访问本类的静态成员
        System.out.println("str=" + str);
        hi();

        //2.静态方法main不能直接访问本类的非静态成员
        //System.out.println("n1=" + n1);
        //cry();

        //3.静态方法main可以通过创建对象来访问非静态成员
        //创建对象后访问非静态成员
        Main01 main01 = new Main01();
        //通过对象访问非静态属性
        System.out.println("n1=" + main01.n1);
        //通过对象访问非静态方法
        main01.cry();
    }
}
