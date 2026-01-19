import java.util.*;

public class Volume{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        double radiusKm = sc.nextDouble();

        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // 1 mile = 1.6 km
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);

        sc.close();
    }
}
