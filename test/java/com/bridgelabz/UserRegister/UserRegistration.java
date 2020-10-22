package com.bridgelabz.UserRegister;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner input = new Scanner(System.in);
	static final String NAME_PATTERN = "^[A-Z]+[a-zA-Z]{2,}$";
	static final String  EMAIL_PATTERN = "^[a-zA-Z.]{3,}[@][a-zA-Z]{2}[.][a-z]{2}[.][a-z]{2}$";
	static final String PHONENUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
	//Method for first name and second name entry validation
	public void NameEntry()
    {
        System.out.println("Enter your first name ");
        String firstName = input.next();
        System.out.println("Enter your second name");
        String secondName = input.next();
        Pattern pattern = Pattern.compile(NAME_PATTERN );
        Matcher firstNameMatch = pattern.matcher(firstName);
        Matcher secondNameMatch = pattern.matcher(secondName);
        System.out.println(firstName + "  " + firstNameMatch.matches());
        System.out.println(secondName + " " + secondNameMatch.matches());
    }
	//Method for email entry validation
	public void emailEntry()
	{
	    System.out.println("Enter your email ");
	    String email = input.next();
	    Pattern pattern;
	    pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher match = pattern.matcher(email);
	    System.out.println(email + "  " + match.matches());
	}
	// method for entry of mobile number
    public void mobileNumberEntry()
    {
        System.out.println("Enter your 10 digit mobile number with country code followed by space ");
        String mobileNumber = input.next();
        Pattern pattern = Pattern.compile(PHONENUMBER_PATTERN);
        Matcher match = pattern.matcher(mobileNumber);
        System.out.println(mobileNumber + "  " + match.matches());
    }
	//Main function
	public static void main(String[] args) 
	{
		System.out.println(" Welcome to user registration program ");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.NameEntry();
		userRegistration.emailEntry();
	}

}
