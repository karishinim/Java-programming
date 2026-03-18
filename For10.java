import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalItems = 0;
        double subtotal = 0;
        for (int i = 0; i < n; i++) {
            String itemName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double itemTotal = price * quantity;
            subtotal += itemTotal;
            totalItems += quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Price: $" + price + " x " + quantity);
            System.out.println("Subtotal: $" + itemTotal);
            System.out.println();
        }
        double tax = subtotal * 0.08;
        double serviceCharge = subtotal * 0.10;
        double grandTotal = subtotal + tax + serviceCharge;
        System.out.println("Total Items: " + totalItems);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Service Charge (10%%): $%.2f\n", serviceCharge);
        System.out.printf("Grand Total: $%.2f\n", grandTotal);
        sc.close();
    }
}