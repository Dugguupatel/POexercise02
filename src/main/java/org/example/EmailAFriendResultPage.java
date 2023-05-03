package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils {
    String expectedEmailAFriendCompleteMsg = "Only registered customers can use email a friend feature";
    public void verifyUserEmailAFriendSuccessfully(){

        String actualMessage = getTextFromElement(By.linkText("Only registered customers can use email a friend feature"));
        //show error
        System.out.println("My massage:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedEmailAFriendCompleteMsg);
    }

}
