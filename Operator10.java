import java.util.Scanner;

public class Operator10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed = sc.nextInt();
        int voltageFluctuation = sc.nextInt();  

        if (unitsConsumed > 500 || voltageFluctuation == 1) {
            System.out.println("Alert Triggered");
        } else {
            System.out.println("Normal Usage");
        }
        sc.close();
    }
}