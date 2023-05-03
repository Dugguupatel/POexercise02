package org.example;

import org.openqa.selenium.By;

public class RegisteredUserEmailAFriend extends Utils {
    By _Email = By.xpath("//input[@class='email']");
    By _Password = By.xpath("//input[@class='password']");
    By _LogIn = By.xpath("//button[@class='button-1 login-button']");
    By _EmailButton = By.xpath("//button[@class='button-2 email-a-friend-button']");
    By _FriendEmail = By.xpath("//input[@class='friend-email']");
    By _YourEmail = By.xpath("//input[@class='your-email']");
    By _PersonalMsg = By.xpath("//textarea[@class='your-email']");
    By _SendEmail = By.xpath("//button[@name='send-email']");

    public void enterRegisteredDetails (){
        //Enter your Email
        typetext(_Email,"abcd1234" + timestamp() + "@gmail.com");
        //Enter your password
        typetext(_Password,"1234567");
        //Click on LOG IN button
        clickOnElements(_LogIn);
        //Click on Email a friend button
        clickOnElements(_EmailButton);
        //Type your email
        typetext(_FriendEmail,"abcd1234" + timestamp() + "@gmail.com");
        //Type friend's email
        typetext(_YourEmail,"test2email"+timestamp()+"@gmail.com");
        //Type msg for friend
        typetext(_PersonalMsg,"Hello");
        //Click on Send email button
        clickOnElements(_SendEmail);
    }
}
