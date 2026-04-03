import java.util.Scanner;

public class Dowhile7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
           
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);
        sc.close();
    }
}