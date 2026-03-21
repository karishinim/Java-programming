import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalTemp = 0;
        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        int maxHour = 0, minHour = 0;
        int hotCount = 0;
        int coldCount = 0;
        for (int i = 0; i < n; i++) {
            int hour = sc.nextInt();
            double temp = sc.nextDouble();
            System.out.println("Hour " + hour + ": " + temp + "°C");
            if (temp > 40 || temp < 0) {
                System.out.println("Status: Extreme");
            } 
            else if (temp >= 32) {
                System.out.println("Status: Hot");
            } 
            else if (temp <= 10) {
                System.out.println("Status: Cold");
            } 
            else {
                System.out.println("Status: Normal");
            }
            System.out.println();
            totalTemp += temp;
            if (temp > maxTemp) {
                maxTemp = temp;
                maxHour = hour;
            }
            if (temp < minTemp) {
                minTemp = temp;
                minHour = hour;
            }
            if (temp >= 32) {
                hotCount++;
            }
            if (temp >= 0 && temp <= 10) {
                coldCount++;
            }
        }
        double avg = totalTemp / n;
        System.out.println("Total Readings: " + n);
        System.out.printf("Average Temperature: %.2f°C\n", avg);
        System.out.println("Highest Temperature: " + maxTemp + "°C at Hour " + maxHour);
        System.out.println("Lowest Temperature: " + minTemp + "°C at Hour " + minHour);
        System.out.println("Hot Hours: " + hotCount);
        System.out.println("Cold Hours: " + coldCount);
        sc.close();
    }
}