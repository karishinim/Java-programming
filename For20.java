import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalTransfers = 0;
        double totalPayments = 0;
        for (int i = 1; i <= N; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            String category;
            if (type.equals("Deposit")) {
                category = "Credit";
                totalDeposits += amount;
            } else {
                category = "Debit";

                if (type.equals("Withdrawal")) {
                    totalWithdrawals += amount;
                } else if (type.equals("Transfer")) {
                    totalTransfers += amount;
                } else if (type.equals("Payment")) {
                    totalPayments += amount;
                }
            }
            System.out.println("Transaction " + i + ": " + type);
            System.out.println("Amount: $" + amount);
            System.out.println("Category: " + category);

            if (i < N) {
                System.out.println();
            }
        }
        double netBalance = totalDeposits - 
                           (totalWithdrawals + totalTransfers + totalPayments);
        System.out.println();
        System.out.println("Total Transactions: " + N);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Withdrawals: $" + totalWithdrawals);
        System.out.println("Total Transfers: $" + totalTransfers);
        System.out.println("Total Payments: $" + totalPayments);
        System.out.println("Net Balance Change: $" + netBalance);
        sc.close();
    }
}