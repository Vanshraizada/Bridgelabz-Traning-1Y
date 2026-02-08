import java.util.*;
import java.util.Arrays;

class Table{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] tab={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number for the multiplication table");
        int a =s.nextInt();
        int b=0;
        System.out.println("The Multiplication Table is:-");

        for (int i=0; i<tab.length; i++){
            b=tab[i]*a;
            System.out.println(a + " x " + tab[i] + " = " + b);
;
        }
    }
}