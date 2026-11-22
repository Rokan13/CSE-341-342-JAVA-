package bd.edu.bubt.cse.customException.util;

import bd.edu.bubt.cse.customException.bubt.cse.edu.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean isRegistrationSuccessful;
        String userName, password;
        Scanner scanner = new Scanner(System.in);

        do {
            isRegistrationSuccessful = true;
            String errorMsg = "";

            System.out.println("Enter your username:");
            userName = scanner.nextLine();

            System.out.println("Enter your password:");
            password = scanner.nextLine();

            // ১. Username চেক (একসাথে সব ইউজারনেম এরর ধরার জন্য)
            try {
                if (!Validator.isFirstLetter(userName)) {
                    throw new UsernameFirstLetterException();
                }
            } catch (UsernameFirstLetterException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            try {
                if (Validator.hasSpace(userName)) {
                    throw new UsernameContainsSpaceException();
                }
            } catch (UsernameContainsSpaceException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            // ২. Password চেক
            try {
                if (!Validator.hasMinLength(password, 8)) {
                    throw new PasswordLengthException();
                }
            } catch (PasswordLengthException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            try {
                if (!Validator.hasCapital(password)) {
                    throw new PasswordNoCapitalLetterException();
                }
            } catch (PasswordNoCapitalLetterException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            try {
                if (!Validator.hasSmall(password)) {
                    throw new PasswordNoSmallLetterException();
                }
            } catch (PasswordNoSmallLetterException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            try {
                if (!Validator.hasDigit(password)) {
                    throw new PasswordNoDigitException();
                }
            } catch (PasswordNoDigitException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            try {
                if (!Validator.hasSpecial(password)) {
                    throw new PasswordNoSpecialCharacterException();
                }
            } catch (PasswordNoSpecialCharacterException e) {
                errorMsg += e.getMessage() + "\n";
                isRegistrationSuccessful = false;
            }

            // কোনো ভুল থাকলে এরর মেসেজ দেখাবে
            if (!isRegistrationSuccessful) {
                System.out.println("\n--- Registration Errors ---");
                System.out.print(errorMsg);
                System.out.println("Please try again!\n");
            }

        } while (!isRegistrationSuccessful);

        System.out.println("User registration is successful!");
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        scanner.close();
    }
}