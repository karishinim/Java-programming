import java.util.Scanner;

public class Operator14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signalValue = sc.nextInt();
        int toggleMask = sc.nextInt();

        int toggledSignal = signalValue ^ toggleMask;

        System.out.println("Toggled Signal = " + toggledSignal);

        sc.close();
    }
}