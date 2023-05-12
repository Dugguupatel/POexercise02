package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ViewNewsResultPage extends Utils{

    String expectedNewsCommentCompleteMsg = "News comment is successfully added.";

    public void verifyUserCommentSuccessfully(){
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My massage:"+actualMessage);

        Assert.assertEquals(actualMessage,expectedNewsCommentCompleteMsg);
    }


}
