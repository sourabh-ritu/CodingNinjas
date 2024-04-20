package org.example.general;

public class Animal {

    int age;
    String name;

    public void bark(){
        System.out.println("How");
    }

    public void walk(){
        System.out.println("crawl");
    }

    public Animal(int age,String name){
        this.age=age;
        this.name=name;
    }
}
