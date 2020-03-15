package com.hogwarts.testcase;

public class Dog {
    String color;
    int age;
    boolean ishun;
    public Dog(int age,String color){
        this.age=age;
        this.color=color;
    }
    int age(){
        return age;
    }
    String color(){
        System.out.println("this is a yellow dog");
        return color;
    }
    String ishun(){
        if (this.age<=3){
            for (int i=0;i<=this.age;i++) {
                System.out.println(i);

                System.out.println("it is hungery");
            }
        }
        else{
            for (int i=0;i<=this.age;i++){
               System.out.println(i);
            }
        }
            System.out.println("it is not hungery");
        return null;
    }


}
