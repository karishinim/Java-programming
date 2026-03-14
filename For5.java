import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        double totalRate = 0;
        double peakRate = 0;
        int peakDay = 0;
        int fullDays = 0;
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();
            double rate = ((double) roomsOccupied / totalRooms) * 100;
            String status;
            if (rate < 60) {
                status = "Low";
            } else if (rate < 80) {
                status = "Moderate";
            } else if (rate < 100) {
                status = "High";
            } else {
                status = "Full";
            }
            if (rate == 100) {
                fullDays++;
            }
            if (rate > peakRate) {
                peakRate = rate;
                peakDay = day;
            }
            totalRate += rate;
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + rate + "%");
            System.out.println("Status: " + status);
            System.out.println();
        }
        double avgRate = totalRate / n;
        System.out.println("Total Days Analyzed: " + n);
        System.out.println("Average Occupancy Rate: " + avgRate + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullDays);
        sc.close();
    }
}
