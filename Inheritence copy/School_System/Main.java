package com.Inheritence.School_System;

public class Main {
    public static void main(String[] args) {
        Staff s=new Staff("Asaw",27,"Support");
        s.detail();
        System.out.println("------------------");
        Student st=new Student("XYZ",18,'A');
        st.detail();
        System.out.println("------------------");
        Teacher t=new Teacher("ABCD",44,"OOPs");
        t.detail();
    }
}
