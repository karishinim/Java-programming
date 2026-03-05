import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); 
        String smokingStatus = sc.nextLine();
        String preExistingConditions = sc.nextLine();
        String coverageTier = sc.nextLine();
        double basePremium = 0.0;
        double riskSurcharge = 0.0;
        double totalPremium = 0.0;
        if (age >= 18 && age <= 30) { 
            if (coverageTier.equalsIgnoreCase("Basic")) {
                basePremium = 200;
            } else if (coverageTier.equalsIgnoreCase("Standard")) {
                basePremium = 300;
            } else if (coverageTier.equalsIgnoreCase("Premium")) {
                basePremium = 500;
            }
        } else if (age >= 31 && age <= 50) {
            if (coverageTier.equalsIgnoreCase("Basic")) {
                basePremium = 250;
            } else if (coverageTier.equalsIgnoreCase("Standard")) {
                basePremium = 350;
            } else if (coverageTier.equalsIgnoreCase("Premium")) {
                basePremium = 600;
            }
        } else if (age >= 51 && age <= 65) { 
            if (coverageTier.equalsIgnoreCase("Basic")) {
                basePremium = 350;
            } else if (coverageTier.equalsIgnoreCase("Standard")) {
                basePremium = 450;
            } else if (coverageTier.equalsIgnoreCase("Premium")) {
                basePremium = 700;
            }
        } else {
            if (coverageTier.equalsIgnoreCase("Basic")) {
                basePremium = 400;
            } else if (coverageTier.equalsIgnoreCase("Standard")) {
                basePremium = 550;
            } else if (coverageTier.equalsIgnoreCase("Premium")) {
                basePremium = 600; 
            }
        }
        if (smokingStatus.equalsIgnoreCase("Smoker") 
                && preExistingConditions.equalsIgnoreCase("Yes")) {
            riskSurcharge = basePremium * 0.70;
        } else if (smokingStatus.equalsIgnoreCase("Smoker")) {
            riskSurcharge = basePremium * 0.40;
        } else if (preExistingConditions.equalsIgnoreCase("Yes")) {
            riskSurcharge = basePremium * 0.30;
        }
        totalPremium = basePremium + riskSurcharge;
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExistingConditions);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);
        sc.close();
    }
}
