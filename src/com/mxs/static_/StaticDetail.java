package com.mxs.static_;

public class StaticDetail {
    public static void main(String[] args) {

        B b = new B();
        System.out.println("b.n1="+b.n1);
        //System.out.println(B.n1);//非静态变量不能通过 【类名.类变量名】的方式访问
        System.out.println(B.n2);//静态变量可以通过【类名.类变量名】的方式访问

        //类变量实在类加载时就创建了
        //也就是说，即使没有创建对象，只要类加载了，就可以使用类变量了。
        System.out.println(C.address);

    }
}

class B {
    public int n1 = 100;//非静态变量
    public static int n2 = 200;//静态变量
}


class C{
    public static String address = "成都市";
}