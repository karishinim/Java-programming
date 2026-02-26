import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int deliveries = sc.nextInt();
        int payout = sc.nextInt();
        int incentive = sc.nextInt();
        int fuelCost = sc.nextInt();

        int netEarnings = (deliveries * payout) 
                          + incentive 
                          - fuelCost;

        System.out.println("Driver Earnings = " + netEarnings);

        sc.close();
    }
}