package org.example.general;

public class Canine extends Animal{

    public void bark(){
        System.out.println("Wolf howl");
    }

    public void walk(){
        System.out.println("wold run");
    }

    public Canine(int age,String name){
        super(age,name);

    }
}
