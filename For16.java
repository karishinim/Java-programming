import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int passCount = 0;
        int failCount = 0;
        int highestScore = Integer.MIN_VALUE;
        double totalScore = 0;
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int correct = sc.nextInt();
            int wrong = sc.nextInt();
            int unattempted = sc.nextInt();
            int score = (correct * 4) - (wrong * 3);
            String result;
            if (score >= 32) {
                result = "Pass";
                passCount++;
            } else {
                result = "Fail";
                failCount++;
            }
            highestScore = Math.max(highestScore, score);
            totalScore += score;
            System.out.println("Student: " + name);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong: " + wrong);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
            System.out.println();
        }
        double average = totalScore / N;
        System.out.println("Total Students: " + N);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);
        sc.close();
    }
}