import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double fuelPrice = sc.nextDouble();
        double tollCharge = sc.nextDouble();
        double fuelNeeded = distance / mileage;
        double fuelCost = fuelNeeded * fuelPrice;
        double totalCost = fuelCost + tollCharge;
        System.out.println("Total Trip Cost = " + (int)totalCost);

        sc.close();
    }
}