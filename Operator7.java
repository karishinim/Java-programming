import java.util.Scanner;

public class Operator7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cartValue = sc.nextInt();
        int premiumMember = sc.nextInt();  

        if (cartValue > 999 || premiumMember == 1) {
            System.out.println("Free Shipping");
        } else {
            System.out.println("Shipping Charges Applied");
        }
        sc.close();
    }
}
