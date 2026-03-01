import java.util.Scanner;

public class B24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseCost = sc.nextDouble();
        double extraGB = sc.nextDouble();
        double ratePerGB = sc.nextDouble();
        double tax = sc.nextDouble();

        double total = baseCost + (extraGB * ratePerGB);
        double bill = total + (total * tax / 100);

        System.out.println("Total Bill = " + bill);

        sc.close();
    }
}