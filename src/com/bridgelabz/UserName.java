package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {

        InputValidate obj = new InputValidate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println(obj.isValidFirstName(firstName) ? "Valid" : "In Valid");
        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        //scanner.close();

        System.out.println(obj.isValidLastName(lastName) ? "Valid" : "In Valid");

        System.out.println("Enter Email: ");
        String email = scanner.next();
        System.out.println(obj.isValidEmail(email) ? "Valid" : "In Valid");

        System.out.println("Enter Mobilenumber: ");
        String mobileNumber = scanner.next();
        System.out.println(obj.isValidMobileNumber(mobileNumber) ? "Valid" : "In Valid");

        System.out.println("Enter password: ");
        String password = scanner.next();
        System.out.println(obj.validPassword(password) ? "Valid" : "In Valid");
    }
}
