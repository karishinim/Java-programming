import java.util.Scanner;
public class B2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysWorked = sc.nextInt();
        double wagePerDay = sc.nextDouble();
        double overtimeBonus = sc.nextDouble();
        double maintenanceCharge = sc.nextDouble();
        double baseSalary = daysWorked * wagePerDay;
        double finalWeeklyWage = baseSalary + overtimeBonus - maintenanceCharge;
        System.out.println("Final Weekly Wage = " + finalWeeklyWage);
        sc.close();
    }
}