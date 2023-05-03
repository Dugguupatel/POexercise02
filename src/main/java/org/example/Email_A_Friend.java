package org.example;

import org.openqa.selenium.By;

public class Email_A_Friend extends Utils{

    //By _products = By.xpath("(//h2[@class='product-title'])[2]\"");
    By _EmailButton = By.xpath("//button[@class='button-2 email-a-friend-button']");
    By _FriendEmail = By.xpath("//input[@class='friend-email']");
    By _YourEmail = By.xpath("//input[@class='your-email']");
    By _PersonalMsg = By.xpath("//textarea[@class='your-email']");
    By _SendEmail = By.xpath("//button[@name='send-email']");


    public void enterProductsDetailForEmailAFriend(){
        //Click on Products
       //clickOnElements(_products);
        //Click on Email a friend button
        clickOnElements(_EmailButton);
        //Type your email
        typetext(_FriendEmail,"test1email"+timestamp()+"@gmail.com");
        //Type friend's email
        typetext(_YourEmail,"test2email"+timestamp()+"@gmail.com");
        //Type msg for friend
        typetext(_PersonalMsg,"Hello");
        //Click on Send email button
        clickOnElements(_SendEmail);
        //GetText from webelement
//        String actualMessage = getTextFromElement(By.linkText("Only registered customers can use email a friend feature"));
//        //show error
//        System.out.println("My massage:" + actualMessage);


    }
}
