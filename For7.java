import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double totalRevenue = 0;
        int totalUnits = 0;
        for (int i = 0; i < N; i++) {
            String consumerID = sc.next();
            int units = sc.nextInt();
            double bill = 0;
            if (units <= 100) {
                bill = units * 0.10;
            } 
            else if (units <= 200) {
                bill = (100 * 0.10) + (units - 100) * 0.13;
            } 
            else if (units <= 300) {
                bill = (100 * 0.10) + (100 * 0.13) + (units - 200) * 0.16;
            } 
            else {
                bill = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + (units - 300) * 0.20;
            }
            String category;
            if (units <= 200) {
                category = "Low Usage";
            } 
            else if (units <= 300) {
                category = "Medium Usage";
            } 
            else {
                category = "High Usage";
            }
            System.out.println("Consumer ID: " + consumerID);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount: $" + bill);
            System.out.println("Category: " + category);
            System.out.println();
            totalUnits += units;
            totalRevenue += bill;
        }
        double averageBill = totalRevenue / N;
        System.out.println("Total Consumers: " + N);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Bill: $" + averageBill);
        sc.close();
    }
}