import java.util.Scanner;
import java.util.Arrays;

public class Height{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] arr= new double[11];

        System.out.println("Enter the Heights of players :");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
	    {
            sum+=arr[i];
	    }
        double a=sum/arr.length;
	    System.out.println("Mean of Height of player :- "+ a);
    }
}
