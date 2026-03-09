import java.util.Scanner;

public class Conditional22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();
        double tier1 = 0, tier2 = 0, tier3 = 0, tier4 = 0;
        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;
        if (customerType.equals("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } 
        else if (customerType.equals("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } 
        else if (customerType.equals("Industrial")) {
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }
        int remainingUnits = unitsConsumed;
        if (remainingUnits > 0) {
            int units = Math.min(remainingUnits, 100);
            tier1 = units * rate1;
            remainingUnits -= units;
        }
        if (remainingUnits > 0) {
            int units = Math.min(remainingUnits, 200);
            tier2 = units * rate2;
            remainingUnits -= units;
        }
        if (remainingUnits > 0) {
            int units = Math.min(remainingUnits, 200);
            tier3 = units * rate3;
            remainingUnits -= units;
        }
        if (remainingUnits > 0) {
            tier4 = remainingUnits * rate4;
        }
        double subtotal = tier1 + tier2 + tier3 + tier4;
        double seasonalPercent = 0;
        if (season.equals("Summer")) {
            seasonalPercent = 15;
        } 
        else if (season.equals("Winter")) {
            seasonalPercent = -10;
        } 
        else if (season.equals("Regular")) {
            seasonalPercent = 0;
        }
        subtotal = subtotal + (subtotal * seasonalPercent / 100);
        double discountPercent = 0;
        if (paymentMethod.equals("Auto-Pay")) {
            discountPercent = 5;
        } 
        else if (paymentMethod.equals("Online")) {
            discountPercent = 3;
        } 
        else if (paymentMethod.equals("Manual")) {
            discountPercent = 0;
        }
        double totalBill = subtotal - (subtotal * discountPercent / 100);
        double averageRate = totalBill / unitsConsumed;
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1);
        System.out.println("Tier 2 Cost (101-300): $" + tier2);
        System.out.println("Tier 3 Cost (301-500): $" + tier3);
        System.out.println("Tier 4 Cost (501+): $" + tier4);
        System.out.println("Seasonal Adjustment: " + (int)seasonalPercent + "%");
        System.out.println("Payment Discount: " + (int)discountPercent + "%");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", averageRate);
        sc.close();
    }
}