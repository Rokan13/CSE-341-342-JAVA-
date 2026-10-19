import java.util.Scanner;

public class NSUGreadingSystem {

    public static String getNSUGrade(double marks) {
        if (marks < 0 || marks > 100) return "Invalid Marks";
        if (marks >= 93) return "A (4.0)";
        if (marks >= 90) return "A- (3.7)";
        if (marks >= 87) return "B+ (3.3)";
        if (marks >= 83) return "B (3.0)";
        if (marks >= 80) return "B- (2.7)";
        if (marks >= 77) return "C+ (2.3)";
        if (marks >= 73) return "C (2.0)";
        if (marks >= 70) return "C- (1.7)";
        if (marks >= 67) return "D+ (1.3)";
        if (marks >= 60) return "D (1.0)";
        return "F (0.0)";
    }

    public static String getBUBTGrade(double marks) {
        if (marks < 0 || marks > 100) return "Invalid Marks";
        if (marks >= 80) return "A+ (4.00)";
        if (marks >= 75) return "A (3.75)";
        if (marks >= 70) return "A- (3.50)";
        if (marks >= 65) return "B+ (3.25)";
        if (marks >= 60) return "B (3.00)";
        if (marks >= 55) return "B- (2.75)";
        if (marks >= 50) return "C+ (2.50)";
        if (marks >= 45) return "C (2.25)";
        if (marks >= 40) return "D (2.00)";
        return "F (0.00)";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total marks (0-100): ");
        if (scanner.hasNextDouble()) {
            double marks = scanner.nextDouble();

            System.out.println("\n--- Grading Results ---");
            System.out.println("NSU System  : " + getNSUGrade(marks));
            System.out.println("BUBT System : " + getBUBTGrade(marks));
        } else {
            System.out.println("Invalid input. Please enter a numerical value.");
        }

        scanner.close();
    }
}