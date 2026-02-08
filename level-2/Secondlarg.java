import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Secondlarg {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int[] a=new int[10];
        int b,c=0;
        while(n>0 && c<10){
            a[c]=n%10;
            n/=10;
            c++;
        }
        int m1=0,m2=0;
        for(int i=0; i<c; i++){
            if(a[i]>m1){
                m2=m1;
                m1=a[i];
            }
        }
        System.out.println("Largest number :- "+m1);
        System.out.println("Second Largest number :- "+m2);
    }
}