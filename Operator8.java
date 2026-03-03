import java.util.Scanner;

public class Operator8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int idProof = sc.nextInt();  

        if (age >= 18 && idProof == 1) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Denied");
        }
        sc.close();
    }
}