import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Arr2D{
    public static void main(String args[]){
        ArrayList<Integer> ar1 = new ArrayList<>();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        System.out.println("The 2D array is =");
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The 1D array of the 2D is =");
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                ar1.add(arr[i][j]);
            }
        }
        System.out.println(ar1);
    }
}