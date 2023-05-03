package org.example;

import org.openqa.selenium.By;

public class RegisteredUserCommunityPole extends Utils{
By _Email = By.xpath("//input[@class='email']");
By _Password = By.xpath("//input[@class='password']");
By _LogIn = By.xpath("//button[@class='button-1 login-button']");
By _Excellent = By.xpath("//input[@id='pollanswers-1']");
By _Vote = By.xpath("//button[@id='vote-poll-1']");
public void enterLoginDetails(){
    typetext(_Email,"abcd1234" + timestamp() + "@gmail.com");
    typetext(_Password,"1234567");
    clickOnElements(_LogIn);
    clickOnElements(_Excellent);
    clickOnElements(_Vote);
}

}
