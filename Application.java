package bd.edu.bubt.sms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double cgpa;
        float marks;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter the marks for CSE341 : ");
        marks = sc.nextFloat();

       GradingAssistant gradingAssistantBUBT = new GradingAssistant();
       bd.edu.aiub.sms.GradingAssistant gradingAssistantAIUB = new bd.edu.aiub.sms.GradingAssistant();

        System.out.println();
        System.out.println("---Student Information---");
        System.out.println("--------");
        System.out.println("Name : " + name);
        System.out.println("Age = : " + age);
        System.out.println("Grade of cse 341(BUBT): " + gradingAssistantBUBT.calculateGrades(marks));
        System.out.println("Grade of cse 341(AIUB): " + gradingAssistantAIUB.calculateGrades(marks));

    }

}
