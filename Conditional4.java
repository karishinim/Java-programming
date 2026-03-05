import java.util.Scanner;

public class Conditional4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loyaltyTier = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine(); 
        String productCategory = sc.nextLine();
        String membershipStatus = sc.nextLine();
        int baseDiscount = 0;
        int additionalDiscount = 0;
        int totalDiscount = 0;
        double finalPrice = 0.0;
        double savings = 0.0;
        if (loyaltyTier.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } else if (loyaltyTier.equalsIgnoreCase("Silver")) {
            baseDiscount = 8;
        } else if (loyaltyTier.equalsIgnoreCase("Gold")) {
            baseDiscount = 12;
        } else if (loyaltyTier.equalsIgnoreCase("Platinum")) {
            baseDiscount = 15;
        }
        if (cartValue >= 500 && cartValue <= 999) {
            additionalDiscount += 3;
        } else if (cartValue >= 1000 && cartValue <= 1999) {
            additionalDiscount += 5;
        } else if (cartValue >= 2000) {
            additionalDiscount += 7;
        }
        if (productCategory.equalsIgnoreCase("Electronics")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount += 5;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Fashion")) {
            additionalDiscount += 3;
        } 
        else if (productCategory.equalsIgnoreCase("Books")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount += 5;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Groceries")) {
            if (cartValue > 300) {
                additionalDiscount += 2;
            }
        }
        totalDiscount = baseDiscount + additionalDiscount;
        finalPrice = cartValue * (1 - totalDiscount / 100.0);
        savings = cartValue - finalPrice;
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + baseDiscount + "%");
        System.out.println("Additional Discount: " + additionalDiscount + "%");
        System.out.println("Total Discount: " + totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);
        sc.close();
    }
}