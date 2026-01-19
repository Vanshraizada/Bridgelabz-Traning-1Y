import java.util.*;
public class Profit{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        // 4. Profit and Profit Percentage
        System.out.print("\nEnter Cost Price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();

        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.println("Profit is INR " + profit);
        System.out.println("Profit percentage is " + profitPercent + "%");

        sc.close();
    }
}