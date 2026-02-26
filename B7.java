import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roomChargePerDay = sc.nextInt();
        int days = sc.nextInt();
        int medicineCost = sc.nextInt();
        int labFees = sc.nextInt();
        int insuranceCoverage = sc.nextInt();

        int finalBill = (roomChargePerDay * days) 
                        + medicineCost 
                        + labFees 
                        - insuranceCoverage;

        System.out.println("Payable Amount = " + finalBill);

        sc.close();
    }
}