import java.util.Scanner;
import java.util.Arrays;

public class Vote {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = s.nextInt();
        char a='A';

        int[] arr=new int[n];
        char[] t = {'A','B','C','D','E','F','G','H','I','J'};
        System.out.println("Enter the Age of Students");
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the age of "+t[i]);
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(arr[i]>=18){
                System.out.println((char)(a+i)+" is eligible for voting");
            }
            
        }

    }
}
