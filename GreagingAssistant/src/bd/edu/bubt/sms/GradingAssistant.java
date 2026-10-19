package bd.edu.bubt.sms;

import java.util.Scanner;

public class GradingAssistant {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float marks;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter the marks for CSE341: ");
        marks = sc.nextFloat();

        // 1. Instantiate the Bubt class
        Bubt gradingAssistantBUBT = new Bubt();

        // 2. FIXED: Instantiate the Aiub class directly
        // Because Aiub is in the same package, you can just call it by its name.
        Aiub gradingAssistantAIUB = new Aiub();

        System.out.println();
        System.out.println("---Student Information---");
        System.out.println("--------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        // 3. Call calculateGrades on both objects
        System.out.println("Grade of cse 341(BUBT): " + gradingAssistantBUBT.calculateGrades(marks));
        System.out.println("Grade of cse 341(AIUB): " + gradingAssistantAIUB.calculateGrades(marks));
    }
}