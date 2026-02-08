import java.util.Scanner;
import java.util.Arrays;

public class Bonus {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] ne= new double[10];
        double[] old= new double[10];
        double[] exp= new double[10];

        System.out.println("Enter the Salary of 10 Employees :");
        for(int i = 0; i < old.length; i++) {
            old[i] = s.nextInt();
        }
        System.out.println("Enter the Years of Experience of 10 Employees :");
        for(int i = 0; i < old.length; i++) {
            exp[i] = s.nextInt();
        }
        System.out.println("The old salaries are = "+Arrays.toString(old));
        double sum=0;
        for(int i=0;i<old.length;i++)
	    {
            ne[i]=((old[i]*exp[i])/100);

	    }
	    System.out.println("Bonus of Employees are:- "+ Arrays.toString(ne));
    }
}
