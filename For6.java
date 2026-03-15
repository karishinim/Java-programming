import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble(); 
        int n = sc.nextInt(); 
        int success = 0;
        int failed = 0;
        double totalWithdrawn = 0;
        for (int i = 1; i <= n; i++) {
            double amount = sc.nextDouble();
            System.out.println("Transaction " + i + ": $" + amount);
            if (amount <= balance) {
                balance -= amount;
                success++;
                totalWithdrawn += amount;
                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                failed++;
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $" + balance);
            }

            System.out.println();
        }
        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failed);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + totalWithdrawn);
        sc.close();
    }
}