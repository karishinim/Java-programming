import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalDuration = 0;
        int totalCalories = 0;
        for (int i = 1; i <= n; i++) {
            String exercise = sc.next();
            int duration = sc.nextInt();
            int caloriesPerMin = 0;
            String intensity = "";
            switch (exercise) {
                case "Running":
                    caloriesPerMin = 10;
                    intensity = "High";
                    break;
                case "Swimming":
                    caloriesPerMin = 12;
                    intensity = "High";
                    break;
                case "Cycling":
                    caloriesPerMin = 8;
                    intensity = "Moderate";
                    break;
                case "Gym":
                    caloriesPerMin = 7;
                    intensity = "Moderate";
                    break;
                case "Walking":
                    caloriesPerMin = 4;
                    intensity = "Low";
                    break;
            }
            int calories = caloriesPerMin * duration;
            totalDuration += duration;
            totalCalories += calories;
            System.out.println("Session " + i + ": " + exercise);
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity: " + intensity);
            System.out.println();
        }
        double averageCalories = (double) totalCalories / n;
        String fitnessLevel;
        if (totalCalories < 300) {
            fitnessLevel = "Beginner";
        } else if (totalCalories <= 1000) {
            fitnessLevel = "Intermediate";
        } else {
            fitnessLevel = "Advanced";
        }
        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.printf("Average Calories per Session: %.2f\n", averageCalories);
        System.out.println("Fitness Level: " + fitnessLevel);
        sc.close();
    }
}