package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserName {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration problems.");

        //creating object
        InputValidate obj = new InputValidate();
        int choose;
        int select;
        do {
            System.out.println("Press 1: Email Address Validation\n2. Exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    obj.validEmailAddress();
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
                    break;
            }
            System.out.println("If you want to continue press 1 or to exit press 2");
            select = sc.nextInt();
        } while (select != 2);
    }

}


