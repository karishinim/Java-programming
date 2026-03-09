import java.util.Scanner;

public class Conditional24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weatherCondition = sc.nextLine();
        double baseFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;
        double peakSurcharge = 0;
        double weatherSurcharge = 0;
        double orderDiscount = 0;
        int deliveryTime = 0;
        String priority = "";
        if (timeSlot.equals("Breakfast")) {
            peakSurcharge = 0;
        } 
        else if (timeSlot.equals("Lunch")) {
            peakSurcharge = 2.5;
        } 
        else if (timeSlot.equals("Dinner")) {
            peakSurcharge = 2.0;
        } 
        else if (timeSlot.equals("Late-Night")) {
            peakSurcharge = 1.5;
        }
        if (weatherCondition.equals("Clear")) {
            weatherSurcharge = 0;
        } 
        else if (weatherCondition.equals("Rain")) {
            weatherSurcharge = 2;
        } 
        else if (weatherCondition.equals("Snow")) {
            weatherSurcharge = 3;
        } 
        else if (weatherCondition.equals("Storm")) {
            weatherSurcharge = 5;
        }
        if (orderValue >= 30 && orderValue < 50) {
            orderDiscount = 1;
        } 
        else if (orderValue >= 50 && orderValue < 75) {
            orderDiscount = 3;
        } 
        else if (orderValue >= 75) {
            orderDiscount = 5;
        }
        double finalFee = baseFee + distanceSurcharge + peakSurcharge + weatherSurcharge - orderDiscount;

        if (finalFee < 2.99) {
            finalFee = 2.99;
        }
        deliveryTime = (int)(distanceMiles * 8);

        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            deliveryTime += 10;
        }

        if (weatherCondition.equals("Rain")) {
            deliveryTime += 5;
        } 
        else if (weatherCondition.equals("Snow")) {
            deliveryTime += 10;
        } 
        else if (weatherCondition.equals("Storm")) {
            deliveryTime += 15;
        }
        if (orderValue > 60) {
            priority = "Express";
        } 
        else if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            priority = "High";
        } 
        else {
            priority = "Standard";
        }
        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + orderDiscount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
        System.out.println("Service Priority: " + priority);
        sc.close();
    }
}