package com.mxs.static_;

public class StaticExercise01 {
    public static void main(String[] args) {
        new Test().count();//count=9    count+1=10
        new Test().count();//count=10   count+1=11
        System.out.println(Test.count);//11
        new Test().count();
    }
}

class Test{
    static int count=9;
    public void count(){
        System.out.println("count="+(count++));
    }
}