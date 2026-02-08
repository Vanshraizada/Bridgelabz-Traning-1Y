import java.util.*;
import java.util.Arrays;

class Gradeing{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] a=new int[3];

        System.out.println("Enter your maths no.:-");
        a[0]=s.nextInt();

        System.out.println("Enter your physics no.:-");
        a[1]=s.nextInt();

        System.out.println("Enter your chemistry no.:-");
        a[2]=s.nextInt();
        
        int d=(a[0]+a[1]+a[2])/3;

        if(d>=80){
            System.out.println("Grade A, Leven4, above agancy standerds=  "+d);
        }
        else if(d<80 && d>=70){
            System.out.println("Grade B, level 3, at agancy standerds=  "+d);
        }
        else if(d<70 && d>=60){
            System.out.println("Grade C, level 2, below but approaching agancy standerds=  "+d);
        }
        else if(d<60 && d>=50){
            System.out.println("Grade D, level 1, well below agancy standerds=  "+d);
        }
        else if(d<50 && d>=40){
            System.out.println("Grade E, level 1-, too below agancy standerds=  "+d);
        }
        else if(d<40 && d>=30){
            System.out.println("Grade R, Remedian Standard=  "+d);
        }
    }
}