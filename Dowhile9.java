import java.util.Scanner;

public class Dowhile9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            while (i * i <= n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
        sc.close();
    }
}