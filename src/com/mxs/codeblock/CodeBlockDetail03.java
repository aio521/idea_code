package com.mxs.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}


class AAA {
    private static int n1 = test1();
    private int d1 = demo1();
    public int demo1() {
        System.out.println("创建对象阶段(普通属性初始化)：AAA的demo1方法被调用");//5
        return 1111;
    }

    public static int test1() {
        System.out.println("类加载阶段（静态属性初始化）：AAA的test1静态方法被调用");//1
        return 111;
    }

    static {
        System.out.println("类加载阶段：AAA的静态代码块被执行");//2
    }

    {
        System.out.println("创建对象阶段：AAA的普通代码块被执行");//6
    }

    public AAA() {
        //（1）super(); 调用父类的构造器
        //(2) 执行本类普通代码块和普通属性初始化
        System.out.println("AAA的构造器被执行");//7
    }
}

class BBB extends AAA {
//    static {
//        System.out.println("类加载阶段：BBB的静态代码块被执行");//4
//    }
    private static int n2 = test2();

    private int d2 = demo2();

    {
        System.out.println("创建对象阶段：BBB的普通代码块被执行");//9
    }

    public int demo2() {
        System.out.println("创建对象阶段(普通属性初始化)：BBB的demo2方法被调用");//8
        return 2222;
    }

    public static int test2() {
        System.out.println("类加载阶段（静态属性初始化）：BBB的test2静态方法被调用");//3
        return 222;
    }

    static {
        System.out.println("类加载阶段：BBB的静态代码块被执行");//4
    }
    

    public BBB() {
        //（1）super(); 调用父类的构造器
        //(2) 执行本类普通代码块
        System.out.println("BBB的构造器被执行");//10
    }

}