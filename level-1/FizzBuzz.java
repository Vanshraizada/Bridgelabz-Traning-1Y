import java.util.*;
import java.util.Arrays;
class FizzBuzz{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a=s.nextInt();
        String r[]= new String[a+1];
        if(a>0){
            for(int i=0; i<=a; i++){
                if((i%3==0 && i%5==0)&& i!=0){
                    r[i]="FizzBuzz";
                }
                else if(i%3==0){
                    r[i]="Fizz";
                }
                else if(i%5==0){
                    r[i]="Buzz";
                }
                else{
                    r[i]=String.valueOf(i);
                }
            }
            System.out.println(Arrays.toString(r));
        }
        
    }
}