import java.util.Scanner;

public class Percentage{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2. Average percentage in PCM
        System.out.print("\nEnter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        double averagePCM = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + averagePCM);

        sc.close();
    }
}
