package org.example.general;

public class AnimalUse {

    public  static void main(String[] args){
        Animal dog = new Canine(23,"tomy");

        System.out.println(dog.name+" age is "+dog.age);
    }
}
