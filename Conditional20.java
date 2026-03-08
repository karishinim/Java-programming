import java.util.Scanner;

public class Conditional20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storageGB = sc.nextInt();
        int userCount = sc.nextInt();
        sc.nextLine();
        String backupFrequency = sc.nextLine();
        String supportTier = sc.nextLine();
        double baseStorageCost = 0;
        double perUserFee = 0;
        double backupPremium = 0;
        double supportFee = 0;
        if (storageGB <= 100) {
            baseStorageCost = storageGB * 0.05;
        } 
        else if (storageGB <= 500) {
            baseStorageCost = (100 * 0.05) + ((storageGB - 100) * 0.04);
        } 
        else if (storageGB <= 2000) {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + ((storageGB - 500) * 0.03);
        } 
        else {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + ((storageGB - 2000) * 0.02);
        }
        if (userCount <= 10) {
            perUserFee = userCount * 5;
        } 
        else if (userCount <= 50) {
            perUserFee = userCount * 4;
        } 
        else {
            perUserFee = userCount * 3;
        }
        if (backupFrequency.equalsIgnoreCase("Daily")) {
            backupPremium = 0;
        } 
        else if (backupFrequency.equalsIgnoreCase("Hourly")) {
            backupPremium = 15 + (0.5 * userCount);
        } 
        else if (backupFrequency.equalsIgnoreCase("Real-Time")) {
            backupPremium = 50 + (1 * userCount);
        }
        if (supportTier.equalsIgnoreCase("Community")) {
            supportFee = 0;
        } 
        else if (supportTier.equalsIgnoreCase("Standard")) {
            supportFee = 20;
        } 
        else if (supportTier.equalsIgnoreCase("Priority")) {
            supportFee = 75;
        } 
        else if (supportTier.equalsIgnoreCase("Enterprise")) {
            supportFee = 200;
        }
        double monthly = baseStorageCost + perUserFee + backupPremium + supportFee;
        double annual = monthly * 12 * 0.9;
        String plan = "";
        String features = "";
        if (userCount == 1) {
            plan = "Personal";
            features = "Basic storage, file sync";
        } 
        else if (userCount <= 20) {
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        } 
        else if (userCount <= 100) {
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        } 
        else {
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }
        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.println("Base Storage Cost: $" + baseStorageCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + annual + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);
        sc.close();
    }
}