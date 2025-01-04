package com.mxs.static_;

public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量 统计有多少小孩加入了游戏
        int count = 0;

        Child child1 = new Child("孙悟空");
        child1.join();
//        count++;
        child1.count++;

        Child child2 = new Child("猪八戒");
        child2.join();
//        count++;
        child2.count++;

        Child child3 = new Child("沙悟净");
        child3.join();
//        count++;
        child3.count++;

        Child child4 = new Child("唐玄奘");
        child4.join();
//        count++;
        child4.count++;

        //类变量可以通过类名来访问
        System.out.println("一共有" + Child.count + "个人加入了游戏");
        System.out.println(child1.count);
        System.out.println(child2.count);
        System.out.println(child3.count);
        System.out.println(child4.count);
    }
}

class Child {
    private String name;

    //定义一个变量 count 是一个类变量也就是静态变量，关键字 static 静态
    //count 就是静态变量 用static修饰，会被Child类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}