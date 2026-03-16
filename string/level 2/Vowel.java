package com.String.L2;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                v++;
            }
            else if (ch == ' ') {
                System.out.println("Invalid");
            }
            else {
                c++;
            }
        }
        System.out.println("Vowels:- " + v);
        System.out.println("Consonants:- " + c);
    }

}