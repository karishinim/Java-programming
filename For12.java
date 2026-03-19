import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        double totalRevenue = 0;
        int peakHourCount = 0;
        for (int i = 1; i <= N; i++) {
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();
            double rate = 0;
            double cap = 0;
            switch (vehicleType) {
                case "Car":
                    rate = 3.0;
                    cap = 30.0;
                    break;
                case "Motorcycle":
                    rate = 2.0;
                    cap = 20.0;
                    break;
                case "Truck":
                    rate = 5.0;
                    cap = 60.0;
                    break;
                case "Bus":
                    rate = 7.0;
                    cap = 100.0;
                    break;
            }
            double calculatedFee = hoursParked * rate;
            double finalFee;
            String capApplied;
            if (calculatedFee > cap) {
                finalFee = cap;
                capApplied = "Yes";
            } else {
                finalFee = calculatedFee;
                capApplied = "No";
            }
            if (hoursParked > 8) {
                peakHourCount++;
            }
            totalRevenue += finalFee;
            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hoursParked);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + finalFee);
            System.out.println("Cap Applied: " + capApplied);
            System.out.println();
        }
        double averageFee = totalRevenue / N;
        System.out.println("Total Vehicles: " + N);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fee: $%.2f\n", averageFee);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakHourCount);
        sc.close();
    }
}