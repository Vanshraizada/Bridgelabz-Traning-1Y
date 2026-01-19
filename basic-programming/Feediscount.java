import java.util.Scanner;

public class Feediscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter university discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("Discount amount is INR " + discount);
        System.out.println("Final fee to be paid is INR " + finalFee);

        sc.close();
    }
}
