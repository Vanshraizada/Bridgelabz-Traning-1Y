import java.util.*;
import java.util.Arrays;

class Till0{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter thee number for sum");
        int a=s.nextInt();
        int i=0,b=0,c=0;
        while(a>0 && i<arr.length){
            arr[i]=a;
            c+=arr[i];
            i++;
            a=s.nextInt();
        }
        System.out.println("Sum= "+c);
            System.out.println(Arrays.toString(arr));
    }
}