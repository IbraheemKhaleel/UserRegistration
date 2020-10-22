package com.bridgelabz.UserRegister;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner input = new Scanner(System.in);
	static final String NAME_PATTERN = "^[A-Z]+[a-zA-Z]{2,}$";
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
	    String emailRegex = "^[a-zA-Z.]{3,}[@][a-zA-Z]{2}[.][a-z]{2}[.][a-z]{2}$";
	    Pattern pattern;
	    pattern = Pattern.compile(emailRegex);
	    Matcher match = pattern.matcher(email);
	    System.out.println(email + "  " + match.matches());
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
