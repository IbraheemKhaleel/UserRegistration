package com.bridgelabz.UserRegister;

import java.util.regex.Pattern;

public class UserValidator 
{
    public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";
    
    public boolean patternMatching(String givenPattern, String givenMatch) throws Exception
    {
    	Pattern pattern = Pattern.compile(givenPattern);
    	try {
        	if (pattern.matcher(givenMatch).matches())
        		return true;
        }catch(Exception e) {
        	throw new userRegistartionException("Please enter correct first name" );
        }
        	return false;	
    }

    public boolean validateName(String fname) throws Exception
    {
    	return patternMatching(NAME_PATTERN, fname);      
    }
    public boolean validateEmailId(String email) throws Exception
    {
    	return patternMatching(EMAIL_ADDRESS_PATTERN, email);
    }
    public boolean validateMobileNumber(String mobile) throws Exception
    {
    	return patternMatching(MOBILE_NUMBER_PATTERN, mobile);
    }
    public boolean validatePassword(String password) throws Exception
    {
    	return patternMatching(PASSWORD_PATTERN, password);
    }

}
