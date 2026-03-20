import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        double totalDistance = 0;
        double totalRevenue = 0;
        for (int i = 1; i <= N; i++) {
            double distance = sc.nextDouble();
            String timeOfDay = sc.next();
            double baseFare = 3.0;
            double distanceCharge = distance * 1.0;
            double timeSurcharge = 0.0;
            if (timeOfDay.equalsIgnoreCase("Evening")) {
                timeSurcharge = 3.0;
            } else if (timeOfDay.equalsIgnoreCase("Night")) {
                timeSurcharge = 5.0;
            }
            double totalFare = baseFare + distanceCharge + timeSurcharge;
            totalDistance += distance;
            totalRevenue += totalFare;
            System.out.println("Ride " + i);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Time: " + timeOfDay);
            System.out.println("Base Fare: $" + baseFare);
            System.out.println("Distance Charge: $" + distanceCharge);
            System.out.println("Time Surcharge: $" + timeSurcharge);
            System.out.println("Total Fare: $" + totalFare);
            System.out.println();
        }
        double averageFare = totalRevenue / N;
        System.out.println("Total Rides: " + N);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fare: $%.2f\n", averageFare);
        sc.close();
    }
}