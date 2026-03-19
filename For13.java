import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int eligibleCount = 0;
        int rejectedCount = 0;
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            boolean isEligible = true;
            String reason = "";
            if (age < 18) {
                isEligible = false;
                reason = "Age below 18 years";
            } else if (age > 65) {
                isEligible = false;
                reason = "Age above 65 years";
            } else if (weight < 50) {
                isEligible = false;
                reason = "Weight below 50 kg";
            } else if (hemoglobin < 12.5) {
                isEligible = false;
                reason = "Hemoglobin below 12.5 g/dL";
            }
            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");
            if (isEligible) {
                System.out.println("Status: Eligible");
                eligibleCount++;
            } else {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: " + reason);
                rejectedCount++;
            }
            System.out.println();
        }
        double eligibilityRate = ((double) eligibleCount / N) * 100;
        System.out.println("Total Donors: " + N);
        System.out.println("Eligible Donors: " + eligibleCount);
        System.out.println("Rejected Donors: " + rejectedCount);
        System.out.printf("Eligibility Rate: %.2f%%\n", eligibilityRate);
        sc.close();
    }
}