import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = sc.nextLine();
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter password:");
            String userInput = sc.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;

                if (attempts == 0) {
                    System.out.println("Account locked!");
                } else {
                    System.out.println("Incorrect! Attempts remaining: " + attempts);
                }
            }
        }
        sc.close();
    }
}