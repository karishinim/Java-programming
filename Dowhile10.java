import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;

        int count = 0;
        System.out.println("Fibonacci sequence (" + n + " terms):");
        while (count < n) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;

            count++;
        }
        sc.close();
    }
}