import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = sc.nextDouble();
        double servicePercent = sc.nextDouble();
        double gstPercent = sc.nextDouble();
        int numberOfPeople = sc.nextInt();
        double serviceCharge = totalBill * servicePercent / 100;
        double billAfterService = totalBill + serviceCharge;
        double gstAmount = billAfterService * gstPercent / 100;
        double finalBill = billAfterService + gstAmount;
        double amountPerPerson = finalBill / numberOfPeople;        
        System.out.println("Amount Per Person = " + amountPerPerson);

        sc.close();
    }
}