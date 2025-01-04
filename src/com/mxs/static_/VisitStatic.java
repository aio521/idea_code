package com.mxs.static_;

public class VisitStatic {
    public static void main(String[] args) {

        //如何访问类变量？
        //1. 类名.类变量名
        //说明类变量是随着类的加载而创建的，因此不需要创建对象实例就可以直接访问
        System.out.println(A.name);

        //2.对象名.类变量名
        //创建对象实例同样可以访问类变量
        A a = new A();
        System.out.println(a.name);

    }
}

class A{
    //类变量
    //类变量的访问，必须遵守 相关的访问权限 public protected 默认 private
    public static String name = "马晓松学java";
}