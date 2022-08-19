package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class InputValidate
{
    // Creating isValidFirstName method to validate the first name given by user using regex
    //return - true or false
    public static boolean isValidFirstName(String firstName) {

        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";  //Declaring regex pattern to check the firstName

        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

    // Creating isValidLastName method to validate the last name given by user using regex
    public static boolean isValidLastName(String lastName) {
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNameRegex);

        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }
    public static boolean isValidEmail(String email) {

        String emailRegex = "^[a-z]{3}[a-zA-Z.]{0,}+@+bl.co+[a-z.]{0,}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    //Creating isValidMobileNumber method to validate the mobile format given by user using regex
    public static boolean isValidMobileNumber(String mobileNumber)
    {
        String mobileNumberRegex = "^[0-9]{2}[\\s][0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

}

