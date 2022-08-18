package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserName {
    Scanner sc=new Scanner(System.in);
    // method to check username Valid or Invalid
    public void validateUsername() {
        System.out.println("Enter UserName");
        String userName=sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";   // regex pattern

        // the pattern is created using the Pattern.compile() method

        Pattern p = Pattern.compile(regex);
        // The matcher() method is used to search for the pattern in a string.
        Matcher matcher = p.matcher(userName);
        //   boolean data type is used for return op is true or false
        boolean result = matcher.matches();
        //  if pattern match then print  valid username if not matched print invalid username
        if(result){
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid username");
        }
    }
    //main method

    public static void main(String[] args)
    {
        UserName registration=new UserName();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter choice\n " +"1)UserName");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    registration.validateUsername();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
