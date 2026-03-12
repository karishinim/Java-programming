import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalScore = 0;
        int highestScore = 0;
        int passCount = 0;
        int failCount = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            String grade;
            String status;
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            if (score >= 60) {
                status = "Pass";
                passCount++;
            } else {
                status = "Fail";
                failCount++;
            }
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }
        double average = (double) totalScore / n;
        System.out.println("Total Students: " + n);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Students Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);
        sc.close();
    }
}