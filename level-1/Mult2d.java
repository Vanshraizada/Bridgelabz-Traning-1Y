import java.util.Scanner;

public class Mult2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int[] r = new int[4];

        int j = 0;
        for (int i = 6; i <= 9; i++) {
            r[j] = a * i;
            j++;
        }
        j = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + r[j]);
            j++;
        }
    }
}