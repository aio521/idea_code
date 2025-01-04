package com.mxs.static_;

public class StaticMethod {

    public static void main(String[] args) {
        Student student1 = new Student("tom");
        student1.payFee(1000);


        Student student2 = new Student("tom");
        student2.payFee(2000);

        Student.showFee();

        System.out.println(MyTools.calSum(15,13));
        System.out.println(Math.sqrt(16));
    }
}
//开发自己的工具类时可以将方法做成静态的，即使在没有实例化对象的情况下也可以使用
class MyTools{
    public static double calSum(double a, double b){
        return a + b;
    }
}

class Student {
    private String name;//非静态变量
    //定义一个静态变量/类变量 累计学生学费
    private static double fee = 0;//静态变量

    public Student(String name) {
        this.name = name;
    }

    //1.当方法使用了static修饰后，该方法就是一个静态方法
    //静态方法就可以访问静态属性
    public static void payFee(double fee) {
        Student.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有：" + Student.fee);
    }

//    public void pay(double fee) {
//        System.out.println(Student.fee);
//    }
}