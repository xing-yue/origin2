package com.hogwarts.testcase;
/*auter:xingye
time :2020-3-13*/
public class javawrite {
    double s = 2.34;
    public static void main(String[]args){
        javawrite tester=new javawrite();
        tester.test1();
        tester.test2();
    }
    public void test1(){
        System.out.println("====测试使用======");
    }
    public void test2(){
        int mimiage;
        String color;
        String elema;
        Dog mimi=new Dog();
        mimiage=mimi.age();
        color=mimi.color();
        System.out.println("mimi is "+mimiage+" years old");
    }

}
