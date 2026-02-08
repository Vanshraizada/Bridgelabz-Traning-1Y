import java.util.*;
import java.util.Arrays;
 class Check2{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter the elements");
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
            }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is Positive and Even");
                }
                else{
                    System.out.println(arr[i]+" is Positive and Odd");
                }
            }
            else if(arr[i]<0){
                System.out.println(arr[i]+" is Negative");
            }
            else{
                System.out.println("Elements is Zero");
            }
        }
        if(arr[0]>arr[arr.length-1]){
            System.out.println("First element is greater");
        }
        else{
            System.out.println("Last element is Greater");
        }

    }
 }