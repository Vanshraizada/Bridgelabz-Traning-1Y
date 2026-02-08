import java.util.*;
import java.util.Arrays;
class Factor{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("ENter the number:-");
        int a=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a%i==0){
                arr.add(i);
            }
        }
        System.out.println("The Factors are:- "+arr);
    }
}