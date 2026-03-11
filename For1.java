import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalPayroll = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            int rating = sc.nextInt();
            int increment = 0;
            if (rating == 5) {
                increment = 15;
            } else if (rating == 4) {
                increment = 10;
            } else if (rating == 3) {
                increment = 5;
            } else if (rating == 2) {
                increment = 2;
            } else {
                increment = 0;
            }
            double finalSalary = baseSalary * (1 + increment / 100.0);
            totalPayroll += finalSalary;
            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + rating);
            System.out.println("Increment: " + increment + "%");
            System.out.println("Final Salary: $" + finalSalary);
            System.out.println();
        }
        double averageSalary = totalPayroll / n;
        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + totalPayroll);
        System.out.printf("Average Salary: $%.2f", averageSalary);

        sc.close();
    }
}