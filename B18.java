import java.util.Scanner;

public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maintenance = sc.nextInt();
        int parking = sc.nextInt();
        int hall = sc.nextInt();
        int security = sc.nextInt();
        int electricity = sc.nextInt();
        int cleaning = sc.nextInt();

        int balance = maintenance
                     + parking
                     + hall
                     - security
                     - electricity
                     - cleaning;

        System.out.println("Remaining Balance = " + balance);
        sc.close();
    }
}