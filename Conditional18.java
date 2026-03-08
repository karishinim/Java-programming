 import java.util.Scanner;

public class Conditional18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double packageWeight = sc.nextDouble();
        sc.nextLine();
        String destinationZone = sc.nextLine();
        String shippingSpeed = sc.nextLine();
        String packageSize = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = 0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0;
        double totalCost;
        String deliveryTime = "";
        String serviceLevel = "";
        if (shippingSpeed.equalsIgnoreCase("Economy")) {
            baseRate = 5;
            serviceLevel = "Budget";
        }
        else if (shippingSpeed.equalsIgnoreCase("Standard")) {
            baseRate = 10;
            serviceLevel = "Standard";
        }
        else if (shippingSpeed.equalsIgnoreCase("Express")) {
            baseRate = 25;
            serviceLevel = "Priority";
        }
        else if (shippingSpeed.equalsIgnoreCase("Overnight")) {
            baseRate = 50;
            serviceLevel = "Premium";
        }
        weightSurcharge = packageWeight * 1;
        if (destinationZone.equalsIgnoreCase("Local")) {
            zoneMultiplier = 1.0;
        }
        else if (destinationZone.equalsIgnoreCase("Regional")) {
            zoneMultiplier = 1.2;
        }
        else if (destinationZone.equalsIgnoreCase("National")) {
            zoneMultiplier = 1.5;
        }
        else if (destinationZone.equalsIgnoreCase("International")) {
            zoneMultiplier = 3.0;
        }
        if (packageSize.equalsIgnoreCase("Small")) {
            sizeSurcharge = 0;
        }
        else if (packageSize.equalsIgnoreCase("Medium")) {
            sizeSurcharge = 5;
        }
        else if (packageSize.equalsIgnoreCase("Large")) {
            sizeSurcharge = 15;
        }
        else if (packageSize.equalsIgnoreCase("Oversized")) {
            sizeSurcharge = 30;
        }
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        totalCost = baseCost + sizeSurcharge;
        if (shippingSpeed.equalsIgnoreCase("Economy")) {

            if (destinationZone.equalsIgnoreCase("Local"))
                deliveryTime = "3-5";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                deliveryTime = "5-7";
            else if (destinationZone.equalsIgnoreCase("National"))
                deliveryTime = "7-10";
            else
                deliveryTime = "14-21";

        }
        else if (shippingSpeed.equalsIgnoreCase("Standard")) {

            if (destinationZone.equalsIgnoreCase("Local"))
                deliveryTime = "2-3";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                deliveryTime = "3-5";
            else if (destinationZone.equalsIgnoreCase("National"))
                deliveryTime = "5-7";
            else
                deliveryTime = "10-14";

        }
        else if (shippingSpeed.equalsIgnoreCase("Express")) {

            if (destinationZone.equalsIgnoreCase("Local"))
                deliveryTime = "1";
            else if (destinationZone.equalsIgnoreCase("Regional"))
                deliveryTime = "1-2";
            else if (destinationZone.equalsIgnoreCase("National"))
                deliveryTime = "2";
            else
                deliveryTime = "3-5";

        }
        else if (shippingSpeed.equalsIgnoreCase("Overnight")) {
            deliveryTime = "1";
        }
        System.out.println("Package Weight: " + packageWeight + " lbs");
        System.out.println("Destination Zone: " + destinationZone);
        System.out.println("Shipping Speed: " + shippingSpeed);
        System.out.println("Package Size: " + packageSize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryTime + " business days");
        System.out.println("Service Level: " + serviceLevel);
        sc.close();
    }
}