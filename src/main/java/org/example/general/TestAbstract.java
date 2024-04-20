package org.example.general;

abstract class TestAbstract {

    int age;
    String name;

    abstract void makeSound();

    private void setName(String name){
        this.name = name;
    }
}
