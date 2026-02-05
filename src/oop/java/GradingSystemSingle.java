/**
 * @author PRICILLA
 */
import java.util.Scanner;

public class GradingSystemSingle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for students score
        System.out.println("Enter students score (0-100): ");
        int score = scanner.nextInt();
        // validate input
        if (score < 0 || score > 100) {
            System.out.print("Invalid score! please enter a value 0 and 100.");
            return;
        }
        String grade;
        String remark;

        // Determine grade and mark using if-else-if
        if (score >= 80 && score <= 100) {
            grade = "1";
            remark = "D1";

        } else if (score >= 75 && score <= 79) {
            grade = "2";
            remark = "D2";

        } else if (score >= 66 && score <= 74) {
            grade = "3";
            remark = "C3";
        } else if (score >= 60 && score <= 69) {
            grade = "4";
            remark = "C4";
        } else if (score >= 50 && score <= 59) {
            grade = "5";
            remark = "C5";
        } else if (score >= 45 && score <= 49) {
            grade = "6";
            remark = "C6";
        } else if (score >= 35 && score <= 44) {
            grade = "7";
            remark = "P7";
        } else if (score >= 30 && score <= 34) {
            grade = "8";
            remark = "P8";
        } else {
            grade = "9";
            remark = "F";

        }
        // Display results
        System.out.print("\n====== GRADE REPORT ======");
        System.out.print("\nScore: " + score + "/100");
        System.out.print("\nGrade: " + grade);
        System.out.print("\nRemark: " + remark);
        System.out.print("\n============");

        scanner.close();
    }
}
