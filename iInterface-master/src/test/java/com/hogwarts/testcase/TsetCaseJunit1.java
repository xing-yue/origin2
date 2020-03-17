package com.hogwarts.testcase;

import org.junit.Test;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

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
