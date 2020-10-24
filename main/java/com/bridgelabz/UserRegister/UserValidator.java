package com.bridgelabz.UserRegister;

public class UserValidator 
{
    public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";
    IPattern iPattern ;
    
   public UserValidator()
   {
	   iPattern = (input , pattern) -> input.matches(pattern);
   }
    public boolean validateName(String fname) throws Exception
    {
    	return iPattern.patternMatcher(fname, NAME_PATTERN);      
    }
    public boolean validateEmailId(String email) throws Exception
    {
    	return iPattern.patternMatcher(email, EMAIL_ADDRESS_PATTERN);
    }
    public boolean validateMobileNumber(String mobile) throws Exception
    {
    	return iPattern.patternMatcher(mobile ,MOBILE_NUMBER_PATTERN);
    }
    public boolean validatePassword(String password) throws Exception
    {
    	return iPattern.patternMatcher(password, PASSWORD_PATTERN);
    }

}
