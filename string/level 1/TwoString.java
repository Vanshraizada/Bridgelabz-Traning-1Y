package com.String.L1;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String a = s.next();
        String b = s.next();
        boolean same = true;

        if (a.length() != b.length()) {
            same = false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("charAt result: " + same);
        System.out.println("equals result: " + a.equals(b));
    }
}
