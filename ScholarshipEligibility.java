import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int familyIncome = sc.nextInt();
        double percentage = sc.nextDouble();
        if (familyIncome < 200000 && percentage >= 75) {
            System.out.println("Scholarship Granted");
        } else {
            System.out.println("Not Granted");
        }
        sc.close();
    }
}