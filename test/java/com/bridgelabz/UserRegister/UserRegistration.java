package com.bridgelabz.UserRegister;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration 
{
	//Welcome text
    @Test
    public void Welcome()
    {
        System.out.println(" Welcome to the program");
    }
    //Checking the validity of first name
    @Test
    public void givenfirstName_WhenProper_ReturnHappy() throws Exception {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateFirstName("Kainey");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenfirstName_WhenImpProper_ReturnSad() throws Exception {
       try {
    	   UserValidator userValidator = new UserValidator();
    	   userValidator.validateFirstName("za");
       }catch(userRegistartionException e) {
        Assert.assertEquals("Please enter correct first name", e.getMessage() );
       }
    }
    //Checking the validity of second name
    @Test
    public void givenLastName_WhenProper_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("Lekize");
       Assert.assertEquals("happy", result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validLastName("lo");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct second name", e.getMessage() );
         }
    }
    //Checking the validity of email id
    @Test
    public void givenEmail_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ikhale@gmail.co.in");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenEmail_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateEmailId("kiloe");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct email", e.getMessage() );
         }
    }
    //Checking the validity of mobile number
    @Test
    public void givenMobileNumber_WhenValid_ReturnHappy() throws Exception 
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("91 9745945143");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenMobileNumber_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateMobileNumber("9869532");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct mobile number", e.getMessage() );
         }
    }
    //Check the validity of password
    @Test
    public void givenPassword_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("ASDsde986#");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenPassword_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validatePassword("ghyui");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct password", e.getMessage() );
         }
    }

}
