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
    public void givenfirstName_WhenProper_ReturnHappy() {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateFirstName("Kale");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenfirstName_WhenImpProper_ReturnSad() {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateFirstName("Ka");
        Assert.assertEquals("sad", result);
    }
    //Checking the validity of second name
    @Test
    public void givenLastName_WhenProper_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("Ibrah");
       Assert.assertEquals("happy", result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("Ib");
       Assert.assertEquals("sad", result);
    }
    //Checking the validity of email id
    @Test
    public void givenEmail_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ikhale@gmail.co.in");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenEmail_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ikhale@gmail.coin");
        Assert.assertEquals("sad", result);
    }
    //Checking the validity of mobile number
    @Test
    public void givenMobileNumber_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("91 9745945143");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenMobileNumber_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("919745945143");
        Assert.assertEquals("sad", result);
    }
    //Check the validity of password
    @Test
    public void givenPassword_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("ASDsde986#");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenPassword_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("ASDsde");
        Assert.assertEquals("sad", result);
    }

}
