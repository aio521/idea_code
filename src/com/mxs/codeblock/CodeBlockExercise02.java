package com.mxs.codeblock;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}


class Sample {
    Sample(String s) {
        //super（）
        //本类代码块
        System.out.println(s);//1.
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}

class Test {
    Sample sam1 = new Sample("sam1成员初始化");//3.
    static Sample sam = new Sample("静态成员sam初始化");//1.
    static {
        System.out.println("static块被执行");//2.
        if (sam==null){
            System.out.println("sam is null");
        }
    }

    public Test() {
        //super()
        //本类代码块
        System.out.println("Test默认构造函数被调用");//4.
    }
}
