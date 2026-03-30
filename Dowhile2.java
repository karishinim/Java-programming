import java.util.Scanner;

public class Dowhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;   
        int sum = 0;
        int count = 0;

        while (num != 0) {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();

            if (num != 0) {
                sum = sum + num;
                count = count + 1;
            }
        }
        System.out.println("Total sum: " + sum);
        System.out.println("Count: " + count);
        sc.close();
    }
}