import java.util.Scanner;

public class PensDistribution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter total number of pens: ");
        int totalPens = sc.nextInt();

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Calculations
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);

        sc.close();
    }
}
