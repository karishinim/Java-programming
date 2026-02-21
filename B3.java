import java.util.Scanner;
public class B3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalBill = sc.nextFloat();
        float servicePercent = sc.nextFloat();
        float gstPercent = sc.nextFloat();
        int numberOfPeople = sc.nextInt();
        float serviceCharge = totalBill * servicePercent / 100;
        float billAfterService = totalBill + serviceCharge;
        float gstAmount = billAfterService * gstPercent / 100;
        float finalBill = billAfterService + gstAmount;
        float amountPerPerson = finalBill / numberOfPeople;        
        System.out.println("Amount Per Person = " + amountPerPerson);

        sc.close();
    }
}