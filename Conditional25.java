import java.util.Scanner;

public class Conditional25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();
        String recommendedPlan = "";
        String planCategory = "";
        double baseCost = 0;
        double dataOverage = 0;
        double callOverage = 0;
        double internationalFee = 0;
        double deviceFee = 0;
        double potentialSavings = 0;
        if (dataGB <= 2 && callMinutes <= 500) {
            recommendedPlan = "Basic 2GB";
            baseCost = 25;
            planCategory = "Budget";

            if (dataGB > 2) {
                dataOverage = (dataGB - 2) * 10;
            }
        }
        else if (dataGB <= 5) {
            recommendedPlan = "Standard 5GB";
            baseCost = 40;
            planCategory = "Standard";

            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
                potentialSavings = 5;
            }
        }
        else if (dataGB <= 30) {
            recommendedPlan = "Premium Unlimited";
            baseCost = 70;
            planCategory = "Premium";
        }
        else {
            recommendedPlan = "Unlimited Max";
            baseCost = 90;
            planCategory = "Unlimited";
        }
        if (callMinutes > 1000 && planCategory.equals("Standard")) {
            callOverage = (callMinutes - 1000) * 0.05;
        }
        if (internationalUsage.equals("Light")) {
            internationalFee = 5;
        }
        else if (internationalUsage.equals("Moderate")) {
            internationalFee = 15;
        }
        else if (internationalUsage.equals("Heavy")) {
            internationalFee = 30;
        }
        if (deviceType.equals("Basic")) {
            deviceFee = 0;
        }
        else if (deviceType.equals("Smartphone")) {
            deviceFee = 10;
        }
        else if (deviceType.equals("Tablet")) {
            deviceFee = 10;
        }
        else if (deviceType.equals("Hotspot")) {
            deviceFee = 20;
        }
        double totalCost = baseCost + dataOverage + callOverage + internationalFee + deviceFee;
        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + potentialSavings);
        System.out.println("Plan Category: " + planCategory);
        sc.close();
    }
}
