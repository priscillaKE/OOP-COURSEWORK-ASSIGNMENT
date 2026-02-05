/**
 * @author PRICILLA
 */
import java.util.Scanner;

public class ModifiedGradingSystemFiveStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store counts for grades 1 through 9
        int[] gradeCount = new int[10]; // index 0 won't be used, grades 1-9

        System.out.println("Enter scores for 5 stuents (0-100)");
        System.out.println("==================================");

        int studentCount = 1;

        // While loop to process 5 students while using the loop struture
        while (studentCount <= 5) {
            System.out.print("\nEnter score for student " + studentCount + ": ");
            int score = scanner.nextInt();

            // validate input
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a value between 0 and 100. ");
                continue; // skip this iteration, ask again
            }
            int grade;

            // Determine grade
            if (score >= 80 && score <= 100) {
                grade = 1;
            } else if (score >= 75 && score <= 79) {
                grade = 2;
            } else if (score >= 66 && score <= 74) {
                grade = 3;
            } else if (score >= 60 && score <= 65) {
                grade = 4;
            } else if (score >= 50 && score <= 59) {
                grade = 5;
            } else if (score >= 45 && score <= 49) {
                grade = 6;
            } else if (score >= 35 && score <= 44) {
                grade = 7;
            } else if (score >= 30 && score <= 34) {
                grade = 8;
            } else {
                grade = 9;
            }

            // Increment count for this grade
            gradeCount[grade]++;

            // Display individual result
            System.out.println("Student " + studentCount + " | Score: " + score + " | Grade: " + grade);
            studentCount++;
        }

        // Display summary
        System.out.println("\n=======GRADE SUMMARY ========");
        System.out.println("Grade\tCount\tStudent");
        System.out.println("-------------------------------");

        for (int i = 1; i <= 9; i++) {
            if (i == 1) System.out.println(i + "\t" + gradeCount[i] + "\tD1");
            else if (i == 2) System.out.println(i + "\t" + gradeCount[i] + "\tD2");
            else if (i == 3) System.out.println(i + "\t" + gradeCount[i] + "\tC3");
            else if (i == 4) System.out.println(i + "\t" + gradeCount[i] + "\tC4");
            else if (i == 5) System.out.println(i + "\t" + gradeCount[i] + "\tC5");
            else if (i == 6) System.out.println(i + "\t" + gradeCount[i] + "\tC6");
            else if (i == 7) System.out.println(i + "\t" + gradeCount[i] + "\tP7");
            else if (i == 8) System.out.println(i + "\t" + gradeCount[i] + "\tP8");
            else System.out.println(i + "\t" + gradeCount[i] + "\tF");
        }

        System.out.println("========================================");
        System.out.println("Total Students: 5");

        scanner.close();
    }
}
