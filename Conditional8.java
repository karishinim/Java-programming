import java.util.Scanner;

public class Conditional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();
        double basePricePerSqFt = 0;
        int ageAdjustmentPercent = 0;
        double amenityBonus;
        double estimatedValue;
        String marketCategory;
        if (locationTier.equals("Prime")) {
            basePricePerSqFt = 400;
        } else if (locationTier.equals("Urban")) {
            basePricePerSqFt = 300;
        } else if (locationTier.equals("Suburban")) {
            basePricePerSqFt = 180;
        } else if (locationTier.equals("Rural")) {
            basePricePerSqFt = 100;
        }
        if (propertyAge <= 5) {
            ageAdjustmentPercent = 0;
        } else if (propertyAge <= 10) {
            ageAdjustmentPercent = -5;
        } else if (propertyAge <= 15) {
            ageAdjustmentPercent = -10;
        } else if (propertyAge <= 30) {
            ageAdjustmentPercent = -15;
        } else {
            ageAdjustmentPercent = -25;
        }
        double baseValue = basePricePerSqFt * squareFootage;
        double adjustedValue = baseValue + (baseValue * ageAdjustmentPercent / 100.0);
        amenityBonus = squareFootage * amenityScore * 0.4;
        estimatedValue = adjustedValue + amenityBonus;
        if (locationTier.equals("Prime") || locationTier.equals("Urban")) {
            if (amenityScore >= 70) {
                marketCategory = "Hot";
            } else {
                marketCategory = "Stable";
            }
        } else if (locationTier.equals("Suburban")) {
            if (amenityScore >= 50) {
                marketCategory = "Stable";
            } else {
                marketCategory = "Slow";
            }
        } else {
            marketCategory = "Slow";
        }
        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustmentPercent + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + estimatedValue);
        System.out.println("Market Category: " + marketCategory);

        sc.close();
    }
}