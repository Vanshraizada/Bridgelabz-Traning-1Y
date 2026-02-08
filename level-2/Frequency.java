import java.util.*;
import java.util.Arrays;
class Frequency{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        int b,c=0,e;
        b=a;
        while(a>0){
            c++;
            a/=10;
        }
        int[] d=new int[c];
        for  (int i=0; i<c; i++){
            d[i]=b%10;
            b/=10;
        }
        int[] f=new int[10];
        for (int i=0; i<c; i++) {
            f[d[i]]++;
        }
        System.out.println("Digit frequencies:");
        for (int i=0; i<10; i++) {
            if (f[i]>0) {
                System.out.println(i + " = " + f[i]);
            }
        }
    }
}