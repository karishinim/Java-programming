import java.util.Scanner;

public class Dowhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;   
        int counter = 1;
        while (counter <= n) {
            result = result * counter;
            counter++;
        }
        System.out.println("Factorial of " + n + " = " + result);
        sc.close();
    }
}