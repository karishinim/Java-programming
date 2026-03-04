import java.util.Scanner;

public class Operator13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int connectionValue = sc.nextInt();
        int applianceMask = sc.nextInt();

        if ((connectionValue & applianceMask) != 0) {
            System.out.println("Appliance Active");
        } else {
            System.out.println("Inactive");
        }

        sc.close();
    }
}