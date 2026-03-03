import java.util.Scanner;

public class Operator12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fileSize = sc.nextInt();
        int compressionCycles = sc.nextInt();

        int compressedSize = fileSize >> compressionCycles;

        System.out.println("Compressed Size = " + compressedSize);

        sc.close();
    }
}