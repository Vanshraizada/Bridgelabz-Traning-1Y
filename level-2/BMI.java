import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] w = new double[n];
        double[] h = new double[n];
        double[] bmi = new double[n];
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1));

            System.out.print("Weight in kg : ");
            w[i] = sc.nextDouble();

            System.out.print("Height in meters : ");
            h[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            bmi[i] = w[i] / (h[i] * h[i]);

            if (bmi[i] < 18.5)
                st[i] = "Underweight";
            else if (bmi[i] < 25)
                st[i] = "Normal";
            else if (bmi[i] < 30)
                st[i] = "Overweight";
            else
                st[i] = "Obese";
        }
        System.out.println("Results:");
        int a=0;
        for (int i = 0; i < n; i++) {
            a++;
            System.out.println("Person = " + a +"\nBMI = "+bmi[i]+ "Status = "+st[i] );
        }
    }
}