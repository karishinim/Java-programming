import java.util.Scanner;

public class Operator9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usernameMatch = sc.nextInt();  
        int passwordMatch = sc.nextInt();  
        int accountLocked = sc.nextInt();  
        if (usernameMatch == 1 && passwordMatch == 1 && !(accountLocked == 1)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
        sc.close();
    }
}