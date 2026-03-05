import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int performanceRating = sc.nextInt();
        int yearsOfService = sc.nextInt();
        sc.nextLine(); 
        String departmentType = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double bonusPercentage = 0;
        double bonusAmount = 0;
        String status = "Not Eligible";
        if (performanceRating >= 3) {
            status = "Eligible";
            if (departmentType.equalsIgnoreCase("Critical")) {

                if (performanceRating == 5 && yearsOfService >= 5) {
                    bonusPercentage = 25;
                } 
                else if (performanceRating == 4 && yearsOfService >= 10) {
                    bonusPercentage = 22;
                } 
                else if (performanceRating == 4) {
                    bonusPercentage = 15;
                } 
                else if (performanceRating == 3) {
                    bonusPercentage = 10;
                }

            } 
            else if (departmentType.equalsIgnoreCase("Non-Critical")) {

                if (performanceRating == 5) {
                    bonusPercentage = 18;
                } 
                else if (performanceRating == 4) {
                    bonusPercentage = 12;
                } 
                else if (performanceRating == 3) {
                    bonusPercentage = 8;
                }
            }
            bonusAmount = baseSalary * (bonusPercentage / 100);
        }
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Department: " + departmentType);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + status);
        sc.close();
    }
}