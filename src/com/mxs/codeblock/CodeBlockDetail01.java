package com.mxs.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //类被加载的情况举例
        //1. 创建对象实例时（new）
//        AA a = new AA();
        //2. 创建子类对象实例，父类也会被加载
//        AA a = new AA();
        //3.使用类的静态成员时（静态属性、静态方法）时，类也会被加载；如果有父类会先加载父类的静态代码块
        System.out.println(Cat.n1);
//        Cat.fun();
    }
}

class Animal{
    static {
        System.out.println("Animal静态代码块被执行");
    }
}

class Cat extends Animal{
    public static int n1 = 100;

    public static void fun() {
        System.out.println("fun方法被调用了");
    }

    static {
        System.out.println("Cat静态代码块被执行");
    }
}

class AA extends BB {//子类

    //静态代码块
    static {
        System.out.println("AA的静态代码块被执行");//2子类后执行
    }
}

class BB {//父类

    static {
        System.out.println("BB的静态代码块被执行");//1父类先执行
    }
}