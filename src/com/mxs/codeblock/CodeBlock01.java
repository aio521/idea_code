package com.mxs.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie m = new Movie("英雄");
        System.out.println("==========================");
        Movie m2 = new Movie("英雄", 66.6);
        System.out.println("==========================");
        Movie m3 = new Movie("英雄", 66.6, "周星驰");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //构造方法重载
    //1.构造器都有相同的语句
    //2.代码冗余
    //3.我们可以把相同的语句放在一个代码块中，然后通过不同的构造方法调用这个代码块
    //4.当我们调用任何一个构造器创建对象的时候，就会先执行构造方法中的代码块
    //5.代码块调用的顺序优先于构造器
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movie(String name, double price, String director) {
        System.out.println("调用了Movie(String name, double price, String director)");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
        System.out.println("调用了Movie(String name, double price)");
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
        System.out.println("调用了Movie(String name)");
        this.name = name;
    }
    
}