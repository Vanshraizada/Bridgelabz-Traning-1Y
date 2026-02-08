import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        double[] h = new double[3];
        System.out.println("Enter age of Amar, Akbar, and Anthony -");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter height of Amar, Akbar, and Anthony");
        for (int i = 0; i < 3; i++) {
            h[i] = sc.nextDouble();
        }
        int  y = 0;
        int t = 0;

        for (int i = 1; i < 3; i++) {
            if (a[i] < a[y]) {
                a[y] = a[i];
            }

            if (h[i] > h[t]) {
                h[t] = h[i];
            }
        }
        System.out.println("Youngest friends age is: " + a[y]);
        System.out.println("Tallest friends height is: " + h[t]);
    }
}