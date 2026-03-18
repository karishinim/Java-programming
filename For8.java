import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int totalItems = 0;
        double originalTotal = 0;
        double finalTotal = 0;
        for (int i = 0; i < n; i++) {
            String productName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            int discount = 0;
            if (quantity == 1) {
                discount = 0;
            } else if (quantity >= 2 && quantity <= 4) {
                discount = 10;
            } else if (quantity >= 5 && quantity <= 9) {
                discount = 15;
            } else {
                discount = 20;
            }
            double originalPrice = price * quantity;
            double subtotal = originalPrice * (1 - discount / 100.0);
            totalItems += quantity;
            originalTotal += originalPrice;
            finalTotal += subtotal;
            System.out.println("Product: " + productName);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println();
        }
        double totalDiscount = originalTotal - finalTotal;
        double savings = (totalDiscount / originalTotal) * 100;
        System.out.println("Total Items: " + totalItems);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.printf("Savings: %.2f%%\n", savings);
        sc.close();
    }
}