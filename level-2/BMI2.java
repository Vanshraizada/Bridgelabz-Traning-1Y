import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] bmi = new double[n][3];
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1));

            System.out.print("Weight in kg : ");
            bmi[i][0] = sc.nextDouble();

            System.out.print("Height in meters : ");
            bmi[i][1] = sc.nextDouble();
    
            bmi[i][2] = bmi[i][0] / (bmi[i][1] * bmi[i][1]);
        }
        for (int i = 0; i < n; i++){
            if (bmi[i][2] < 18.5){
                st[i] = "Underweight";
            }
            else if (bmi[i][2] < 25){
                st[i] = "Normal";
            }
            else if (bmi[i][2] < 30){
                st[i] = "Overweight";
            }
            else{
                st[i] = "Obese";
            }
        }
        System.out.println("Results:");
        int a=0;
        for (int i = 0; i < n; i++) {
            a++;
            System.out.println("Person = " + a  +"\nBMI %.2f = "+bmi[i][2]+ "\nStatus = "+st[i] );
        }
    }
}