package com.hogwarts.testcase;

import java.text.ParseException;
import java.util.concurrent.Callable;

/*auter:xingye
time :2020-3-13*/
public class javawrite {
    double s = 2.34;
    public static void main(String[]args){
        javawrite tester=new javawrite();
        tester.test1();
        tester.test2();
        tester.test3();
    }

    private void test3() {
        ConSql conSql;
        Object[] data ={"xihuan","32","3","4","5","6","7"};
        conSql = new ConSql();
        try {
            conSql.saveinfo(data);
            conSql.findinfo(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("do it ");
    }

    public void test1(){
        System.out.println("====测试使用======");
    }
    public void test2(){
        int mimiage;
        String color;
        String ishun;
        Dog mimi;
        int[]nums={1,2,3,4};
        for(int a2:nums){
        mimi = new Dog(a2,"blue" );
        mimiage=mimi.age;
        color=mimi.color();
        ishun=mimi.ishun();

        System.out.println("mimi is "+mimiage+" years old,and it is "+color);
        if(a2==2){
            continue;
        }
            if(a2==3){
                break;
            }
        }
    }

}


