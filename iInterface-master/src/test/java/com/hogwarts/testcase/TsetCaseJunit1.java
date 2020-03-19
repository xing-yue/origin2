package com.hogwarts.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TsetCaseJunit1 {
    @BeforeClass
    public  void  fun1(){
        System.out.println("fun1 is work");
    }
    @Before
    public  void  fun2(){
        System.out.println("fun2 is work");
    }
    @Test
    public  void  fun3(){
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
            assertThat("dog is blue?","blue",equalTo(color));
            assertThat("dog age?",2.0,
                    is(closeTo(mimiage,2.0)));
            System.out.println("mimi is "+mimiage+" years old,and it is "+color);
            if(a2==2){
                continue;
            }
            if(a2==3){
                break;
            }
        }
        System.out.println("fun3 is work");
    }
    @Ignore
    @Test
    public  void  fun6(){
        System.out.println("fun6 is work");
    }
    @After
    public  void  fun4(){
        System.out.println("fun4 is work");
    }
    @AfterClass
    public  void  fun5(){
        System.out.println("fun5 is work");
    }

}
