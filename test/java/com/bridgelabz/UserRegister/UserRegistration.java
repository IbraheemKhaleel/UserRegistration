package com.bridgelabz.UserRegister;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner input = new Scanner(System.in);
	static final String FIRSTNAME_PATTERN = "^[A-Z]+[a-zA-Z]{2,}$";
	//Method for first name entry validation
	public void firstNameEntry()
    {
        System.out.println("Enter your first name ");
        String firstName = input.next();
        Pattern pattern = Pattern.compile(FIRSTNAME_PATTERN );
        Matcher match = pattern.matcher(firstName);
        System.out.println(firstName + "  " + match.matches());
    }
	
	public static void main(String[] args) {
		System.out.println(" Welcome to user registration program ");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameEntry();
	}

}
