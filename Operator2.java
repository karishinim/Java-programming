import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double accountBalance = sc.nextDouble();
        double withdrawalAmount = sc.nextDouble();
        double dailyLimit = sc.nextDouble();

        if (withdrawalAmount <= accountBalance && withdrawalAmount <= dailyLimit) {
            System.out.println("Transaction Approved");
        } else {
            System.out.println("Transaction Declined");
        }

        sc.close();
    }
}