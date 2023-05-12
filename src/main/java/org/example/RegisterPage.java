package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    By _FirstName = By.xpath("//input[@id='FirstName']");
    By _LastName = By.xpath("//input[@id='LastName']");
    By _day = By.xpath("//select[@name='DateOfBirthDay']");
    By _month = By.xpath("//select[@name='DateOfBirthMonth']");
    By _year = By.xpath("//select[@name='DateOfBirthYear']");
    By _Email = By.xpath("//input[@id='Email']");
    By _Password = By.xpath("//input[@id='Password']");
    By _ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By _registerButton = By.xpath("//button[@id='register-button']");

    public void enterRegistrationDetails() {
        //Type first name
        typetext(_FirstName, "TestFirstName");
        //Type Last name
        typetext(_LastName, "testLastName");
        //Select Day
        selectElementByValue(_day, "15");
        //Select month
        selectElementByIndex(_month,5);
        //Select Year
        selectElementByText(_year,"1999");
        //Type Email address
        typetext(_Email, "ap21" + timestamp() + "@gmail.com");
        //type password
        typetext(_Password, "Test10234");
        //Type confirm password
        typetext(_ConfirmPassword, "Test10234");
        //click on Register submit button
        clickOnElements(_registerButton);


    }

}
