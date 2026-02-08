import java.util.*;
import java.util.Arrays;
 class Check{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] arr=new int[n];

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.println("Enter the numbers");
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
            }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else if(arr[i]%2!=0){
                odd.add(arr[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
 }