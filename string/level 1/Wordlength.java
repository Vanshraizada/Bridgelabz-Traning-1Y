package com.String.L1;

public class Wordlength {
    public static void main(String[] args) {

        String s="hello world";
        String[] s1=s.split(" ");
        String[][] a= new String[s.length()][2];
        for (int i = 0; i < s1.length; i++) {
            a[i][0]=s1[i];
            String b=s1[i];
            a[i][1] = String.valueOf(b.length());
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + "  " + a[i][1]);
        }
    }
}
