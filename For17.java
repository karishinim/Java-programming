import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int urgentCount = 0;
        double totalRevenue = 0;
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            String type = sc.next();
            int days = sc.nextInt();
            double renewalFee = 0;
            if (type.equalsIgnoreCase("Basic")) {
                renewalFee = 50.0;
            } else if (type.equalsIgnoreCase("Premium")) {
                renewalFee = 100.0;
            } else if (type.equalsIgnoreCase("VIP")) {
                renewalFee = 200.0;
            }
            int discount = 0;
            if (days >= 45) {
                discount = 20;
            } else if (days >= 30) {
                discount = 15;
            } else if (days >= 15) {
                discount = 10;
            } else {
                discount = 0;
            }
            double finalFee = renewalFee * (1 - discount / 100.0);
            String priority;
            if (days < 10) {
                priority = "Urgent";
                urgentCount++;
            } else if (days <= 30) {
                priority = "High";
            } else {
                priority = "Normal";
            }
            totalRevenue += finalFee;
            System.out.println("Member: " + name);
            System.out.println("Membership: " + type);
            System.out.println("Days Until Expiry: " + days);
            System.out.println("Renewal Fee: $" + renewalFee);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Fee: $" + finalFee);
            System.out.println("Priority: " + priority);
            System.out.println();
        }
        double averageFee = totalRevenue / N;
        System.out.println("Total Members: " + N);
        System.out.println("Urgent Renewals: " + urgentCount);
        System.out.println("Total Renewal Revenue: $" + totalRevenue);
        System.out.println("Average Renewal Fee: $" + averageFee);
        sc.close();
    }
}
