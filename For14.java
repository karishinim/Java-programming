import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        double totalFines = 0;
        int overdueCount = 0;
        for (int i = 1; i <= N; i++) {
            String bookType = sc.next();
            int daysLate = sc.nextInt();
            double rate = 0;
            double cap = 0;
            switch (bookType) {
                case "Regular":
                    rate = 0.5;
                    cap = 10.0;
                    break;
                case "Reference":
                    rate = 1.0;
                    cap = 20.0;
                    break;
                case "Magazine":
                    rate = 0.25;
                    cap = 5.0;
                    break;
            }
            double calculatedFine = daysLate * rate;
            double actualFine;
            String capApplied;
            if (calculatedFine > cap) {
                actualFine = cap;
                capApplied = "Yes";
            } else {
                actualFine = calculatedFine;
                capApplied = "No";
            }
            if (daysLate > 0) {
                overdueCount++;
            }
            totalFines += actualFine;
            System.out.println("Book " + i + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + rate);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + capApplied);
            System.out.println();
        }
        double averageFine = totalFines / N;
        System.out.println("Total Books: " + N);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdueCount);
        System.out.printf("Average Fine: $%.2f\n", averageFine);
        sc.close();
    }
}