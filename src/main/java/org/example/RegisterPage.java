package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    By _FirstName = By.xpath("//input[@id='FirstName']");
    By _LastName = By.xpath("//input[@id='LastName']");
    By _Email = By.xpath("//input[@id='Email']");
    By _Password = By.xpath("//input[@id='Password']");
    By _ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By _registerButton = By.xpath("//button[@id='register-button']");

    public void enterRegistrationDetails() {
        //Type first name
        typetext(_FirstName, "TestFirstName");
        //Type Last name
        typetext(_LastName, "testLastName");
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
