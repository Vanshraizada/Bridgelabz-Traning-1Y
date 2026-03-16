package com.String.L1;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        s.nextLine();
        String s1 = s.nextLine();
        char c='a';

        for (int i = a; i < b; i++) {
            c=s1.charAt(i);
            System.out.print(c);
        }
    }
}
