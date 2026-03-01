import java.util.Scanner;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int copies = sc.nextInt();
        int costPerCopy = sc.nextInt();
        int editing = sc.nextInt();
        int design = sc.nextInt();
        int commission = sc.nextInt();
        int marketing = sc.nextInt();

        int profit = (copies * costPerCopy)
                     + editing
                     + design
                     - commission
                     - marketing;

        System.out.println("Final Profit = " + profit);
        sc.close();
    }
}