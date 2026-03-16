package com.String.L2;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] words = new String[100];
        int w = 0;
        String current = "";

        int i = 0;
        while (i < line.length()) {
            char ch = line.charAt(i);

            if (ch == ' ') {
                words[w++] = current;

            } else {
                current += ch;
            }
            i++;
        }

        if (!current.equals("")) {
            words[w++] = current;
        }

        for (int j = 0; j < w; j++) {
            System.out.println(words[j]);
        }
    }
}
