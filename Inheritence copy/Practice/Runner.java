package com.Inheritence.Practice;

public class Runner {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.walk();
        Dog d=new Dog();
        d.sound();
        puppy p=new puppy();
        p.look();
        d.sound();
        a.walk();
    }
}
