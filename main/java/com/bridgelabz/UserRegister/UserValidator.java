package com.bridgelabz.UserRegister;

import java.util.regex.Pattern;

public class UserValidator 
{
    public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";

    public boolean validateFirstName(String fname) throws Exception
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        try {
        if (pattern.matcher(fname).matches())
        		return true;
        }catch(Exception e)
        {
        	throw new userRegistartionException("Please enter correct first name" );
        }
        	return false;
    }
    public boolean validLastName(String lname) throws Exception
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        try
        {
        	if (pattern.matcher(lname).matches())
        		return true;
        } catch (Exception e)
        {
        	throw new userRegistartionException(" Please enter correct second name " );
        }
        return false;
    }
    public boolean validateEmailId(String email) throws Exception
    {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        try
        {
        	if (pattern.matcher(email).matches())
        		return true;
        } catch (Exception e)
        {
        	throw new userRegistartionException("Please enter correct email" );
        }
        return false;
    }
    public boolean validateMobileNumber(String mobile) throws Exception
    {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        try
        {
        	if (pattern.matcher(mobile).matches())
        		return true;
        } catch (Exception e)
        {
        	throw new userRegistartionException("Please enter correct mobile number" );
        }
        return false;
    }
    public boolean validatePassword(String password) throws Exception
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        try
        {
        	if (pattern.matcher(password).matches())
        		return true;
        } catch (Exception e)
        {
        	throw new userRegistartionException("Please enter correct password" );
        }
        return false;
    }

}
