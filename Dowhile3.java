import java.util.Scanner;

public class Dowhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = sc.nextInt();

        int guess = -1;
        int count = 0;

        while (guess != secretNumber) {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            count++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! Attempts: " + count);
            }
        }
        sc.close();
    }
}