package com.bridgelabz.UserRegister;

import java.util.regex.Pattern;

public class UserValidator 
{
	public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";

    public String validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matcher(fname).matches())
        	return "happy";
        return "sad";
    }
    public String validLastName(String lname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matcher(lname).matches())
        	return "happy";
        return "sad";
    }
    public String validateEmailId(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        if (pattern.matcher(email).matches())
        	return "happy";
        return "sad";
    }
    public String validateMobileNumber(String mobile)
    {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        if(pattern.matcher(mobile).matches())
        	return "happy";
        return "sad";
    }
    public String validatePassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if ( pattern.matcher(password).matches())
        	return "happy";
        return "sad";
    }

}
