 import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int workingHours = sc.nextInt();
        int attendancePercentage = sc.nextInt();

        if (workingHours > 40 && attendancePercentage > 90) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
