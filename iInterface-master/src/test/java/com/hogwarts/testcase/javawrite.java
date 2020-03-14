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
        String ishun;
        Dog mimi;
        int[]nums={1,2,3,4};
        for(int a2:nums){
        mimi = new Dog(a2,"blue" );
        mimiage=mimi.age();
        color=mimi.color();
        ishun=mimi.ishun();
        System.out.println("mimi is "+mimiage+" years old,and it is "+color);
        }
    }

}
