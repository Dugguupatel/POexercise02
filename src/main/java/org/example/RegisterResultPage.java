package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    String expectedRegistrationCompleteMsg = "Registration is Completed";
    public void verifyUserRegisteredSuccessfully(){
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My massage:"+actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMsg);
    }

}
