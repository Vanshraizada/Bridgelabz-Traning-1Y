import java.util.Scanner;

public class Kilometers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // 3. Kilometers to miles
        System.out.print("\nEnter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);

        sc.close();
    }
}
