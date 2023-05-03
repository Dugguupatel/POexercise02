package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisteredUserEmailAFriendResultPage extends Utils {

    String expectedEmailAFriendSuccessfullyMsg = "Email a friend successfully";

    public void verifyUserEmailAFriendSuccessfully(){

        String actualMessage = getTextFromElement(By.className("Successful message"));
        System.out.println("My message:"+actualMessage);

        Assert.assertEquals(actualMessage,expectedEmailAFriendSuccessfullyMsg);
    }


}
