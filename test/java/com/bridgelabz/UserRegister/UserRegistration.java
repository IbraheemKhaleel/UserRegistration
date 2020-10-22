package com.bridgelabz.UserRegister;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	Scanner input = new Scanner(System.in);
	static final String NAME_PATTERN = "^[A-Z]+[a-zA-Z]{2,}$";    //name pattern for valid name
	static final String  EMAIL_PATTERN = "^[a-zA-Z.]{3,}[@][a-zA-Z]{2}[.][a-z]{2}[.][a-z]{2}$";		//valid email pattern
	static final String PHONENUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";	// valid phone number pattern
	static final String PASSWORD_PATTERN ="^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";	//valid password pattern
	
	//Method for first name and second name entry validation
	public void NameEntry()
    {
        System.out.println(" Enter your first name  ");
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
        String mobileNumber = "91 9878987876";
        Pattern pattern = Pattern.compile(PHONENUMBER_PATTERN);
        Matcher match = pattern.matcher(mobileNumber);
        System.out.println(mobileNumber + "  " + match.matches());
    }
    //method for entry of password
    public void passwordEntry()
    {
        System.out.println("Enter your password with minimum 8 alphabets ,one numeric,one special character and one upper cases ");
        String password = input.next();     
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher match = pattern.matcher(password);
        System.out.println(password + "  " + match.matches());
    }
	//Main function
	public static void main(String[] args) 
	{
		System.out.println(" Welcome to user registration program ");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.NameEntry();
		userRegistration.emailEntry();
		userRegistration.mobileNumberEntry();
		userRegistration.passwordEntry();
	}

}
