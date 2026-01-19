import java.util.*;
public class Age{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 1. Age of Harry
        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;
        System.out.println("Harry's age in " + currentYear + " is " + age);
		
        sc.close();
    }
}
