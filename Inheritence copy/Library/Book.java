package com.Inheritence.Library;

public class Book {
    String title;
    int Publicationyear;
    public Book(int Publicationyear,String title){
        this.Publicationyear=Publicationyear;
        this.title=title;
    }
    public void detail(){
        System.out.println("Title of the book: "+title);
        System.out.println("Publication Year of the Book: "+Publicationyear);
    }
}
