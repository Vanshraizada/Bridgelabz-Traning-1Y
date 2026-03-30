package com.CreatingOfMethod.L2;
import java.util.*;
public class Factor {
    public static void Array(int a){
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a%i==0){
                ar.add(i);
            }
        }
        System.out.println("Factors"+ar);
        int c= 0,d=1,e=0;
        for(int i=1; i<=a; i++){
            if(a%i==0) {
                c+=i;
                d*=i;
                e+=i*i;
            }
        }
        System.out.println("Sum of Factors:"+c+"\nMultiple of Factors:"+d+"\nSum of Square:"+e);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        Array(a);
    }
}
