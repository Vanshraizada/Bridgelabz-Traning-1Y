package com.Inheritence.Library;

public class Author extends Book {
    String name;
    String bio;
    public Author(int Publicationyear,String title,String name,String bio){
        super(Publicationyear,title);
        this.name=name;
        this.bio=bio;
    }
    public void detail(){
        super.detail();
        System.out.println("Author name: "+name);
        System.out.println("Bio of Author: "+bio);
    }
}
