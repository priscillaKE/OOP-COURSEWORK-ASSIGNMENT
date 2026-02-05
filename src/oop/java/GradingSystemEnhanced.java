/**
 * @author PRICILLA
 */
import java.util.Scanner;

public class GradingSystemEnhanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] gradeCount = new int[10];
        String[] remarks = {"", "D1", "D2", "C3", "C4", "C5", "C6", "P7", "P8", "F"};

        System.out.println("====== UGANDA O-LEVEL GRADING SYSTEM =====");
        System.out.println("Enter scores for 5 students\n");

        int student = 1;

        while (student <= 5) {
            System.out.println("Student " + student + " score (0-100): ");
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid! Enter 0-100.");
                continue;
            }

            int grade;
            if (score >= 80) grade = 1;
            else if (score >= 75) grade = 2;
            else if (score >= 66) grade = 3;
            else if (score >= 60) grade = 4;
            else if (score >= 50) grade = 5;
            else if (score >= 45) grade = 6;
            else if (score >= 35) grade = 7;
            else if (score >= 30) grade = 8;
            else grade = 9;

            gradeCount[grade]++;
            System.out.println("Grade: " + grade + " (" + remarks[grade] + ")");
            student++;
        }
        System.out.println("\n=====================");
        System.out.println("GRADE DISTRIBUTION SUMMARY");
        System.out.println("===========================");
        System.out.printf("%-10s %-10s %-10s %-10s\n",
                "Grade", "Remark", "Count", "Percentage");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            double percentage = (gradeCount[i] / 5.0) * 100;
            System.out.printf("%-10d %-10s %-10d %-10.1f%%\n",
                    i, remarks[i], gradeCount[i], percentage);
        }

        System.out.println("===================");
        scanner.close();
    }
}
