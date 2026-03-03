import java.util.Scanner;

public class Operator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long creditLimit = sc.nextLong();
        long purchaseAmount = sc.nextLong();
        int cardBlocked = sc.nextInt(); 
        if (purchaseAmount <= creditLimit && cardBlocked == 0) {
            System.out.println("Approved");
        } else {
            System.out.println("Declined");
        }
        sc.close();
    }
}