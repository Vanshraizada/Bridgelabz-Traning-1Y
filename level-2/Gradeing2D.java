import java.util.*;
import java.util.Arrays;

class Gradeing2D{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int b=s.nextInt();
        int[][] a=new int[b][3];

        for(int i=0; i<b ;i++){
        System.out.println("Student:-"+ (i+1));

        System.out.println("Enter maths no.:-");
        a[i][0]=s.nextInt();

        System.out.println("Enter physics no.:-");
        a[i][1]=s.nextInt();

        System.out.println("Enter chemistry no.:-");
        a[i][2]=s.nextInt();
        }

        int[] d=new int[b];
        for(int i=0; i<b ;i++){
            d[i]=(a[i][0]+a[i][1]+a[i][2])/3;
        }
        for(int i=0; i<b; i++){
            System.out.println("Student "+(i+1)+" Result is:- ");
            if(d[i]>=80){
                System.out.println("Grade A, Leven4, above agancy standerds=  "+d[i]);
            }
            else if(d[i]<80 && d[i]>=70){
                System.out.println("Grade B, level 3, at agancy standerds=  "+d[i]);
            }
            else if(d[i]<70 && d[i]>=60){
                System.out.println("Grade C, level 2, below but approaching agancy standerds=  "+d[i]);
            }
            else if(d[i]<60 && d[i]>=50){
                System.out.println("Grade D, level 1, well below agancy standerds=  "+d[i]);
            }
            else if(d[i]<50 && d[i]>=40){
                System.out.println("Grade E, level 1-, too below agancy standerds=  "+d[i]);
            }
            else if(d[i]<40 && d[i]>=30){
                System.out.println("Grade R, Remedian Standard=  "+d[i]);
            }
        }
    }
}