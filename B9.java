import java.util.Scanner;

public class B9{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int rate = sc.nextInt();
        int maintenance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();

        int transportFee = (distance * rate)
                           + maintenance
                           + allowance
                           - subsidy;

        System.out.println("Total Transport Fee = " + transportFee);

        sc.close();
    }
}