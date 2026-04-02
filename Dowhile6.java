import java.util.Scanner;

public class Dowhile6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;     
            reversed = reversed * 10 + digit; 
            number = number / 10;
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}