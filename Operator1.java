import java.util.Scanner;
public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int theoryMarks = sc.nextInt();
        int practicalMarks = sc.nextInt();
        double average = (theoryMarks + practicalMarks) / 2.0;
        if (theoryMarks >= 50 && practicalMarks >= 50 && average >= 60) {
            System.out.println("Result = PASS");
        } else {
            System.out.println("Result = FAIL");
        }
        sc.close();
    }
}