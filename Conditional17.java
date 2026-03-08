import java.util.Scanner;

public class Conditional17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cardTier = sc.nextLine();
        String purchaseCategory = sc.nextLine();
        double transactionAmount = sc.nextDouble();
        sc.nextLine();
        String promotionalStatus = sc.nextLine();

        double baseRate = 1.0;
        double categoryBonus = 1.0;
        double tierMultiplier = 1.0;
        double promoMultiplier = 1.0;
        String rewardsTier = "";
        if (purchaseCategory.equalsIgnoreCase("Groceries")) {
            categoryBonus = 2.0;
        } 
        else if (purchaseCategory.equalsIgnoreCase("Dining")) {
            categoryBonus = 2.5;
        } 
        else if (purchaseCategory.equalsIgnoreCase("Travel")) {
            categoryBonus = 3.0;
        } 
        else if (purchaseCategory.equalsIgnoreCase("Gas")) {
            categoryBonus = 2.0;
        } 
        else {
            categoryBonus = 1.0;
        }
        if (cardTier.equalsIgnoreCase("Basic")) {
            tierMultiplier = 1.0;
            rewardsTier = "Standard";
        } 
        else if (cardTier.equalsIgnoreCase("Gold")) {
            tierMultiplier = 1.25;
            rewardsTier = "Enhanced";
        } 
        else if (cardTier.equalsIgnoreCase("Platinum")) {
            tierMultiplier = 1.5;
            rewardsTier = "Premium";
        } 
        else if (cardTier.equalsIgnoreCase("Black")) {
            tierMultiplier = 2.0;
            rewardsTier = "Elite";
        }
        if (promotionalStatus.equalsIgnoreCase("None")) {
            promoMultiplier = 1.0;
        } 
        else if (promotionalStatus.equalsIgnoreCase("Double-Points")) {
            promoMultiplier = 2.0;
        } 
        else if (promotionalStatus.equalsIgnoreCase("Triple-Points")) {
            promoMultiplier = 3.0;
        }
        double pointsEarned = transactionAmount * baseRate * categoryBonus * tierMultiplier * promoMultiplier;
        double cashValue = pointsEarned * 0.01;
        System.out.println("Card Tier: " + cardTier);
        System.out.println("Purchase Category: " + purchaseCategory);
        System.out.println("Transaction Amount: $" + transactionAmount);
        System.out.println("Promotional Status: " + promotionalStatus);
        System.out.println("Base Points Rate: " + baseRate + " points per dollar");
        System.out.println("Category Bonus: " + categoryBonus + "x");
        System.out.println("Tier Multiplier: " + tierMultiplier + "x");
        System.out.println("Promotional Multiplier: " + promoMultiplier + "x");
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Equivalent Cash Value: $" + cashValue);
        System.out.println("Rewards Tier: " + rewardsTier);
        sc.close();
    }
}