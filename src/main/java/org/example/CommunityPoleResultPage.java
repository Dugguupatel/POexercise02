package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CommunityPoleResultPage extends Utils {
    String expectedCommunityPoleCompleteMsg = "Only registered users can vote.";

    public void verifyCommunityPoleSuccessfully(){
        //Get text
        String actualMessage= getTextFromElement(By.xpath("//div[@class='poll-vote-error']"));
        System.out.println("My message: "+actualMessage);

        Assert.assertEquals(actualMessage,expectedCommunityPoleCompleteMsg);
    }

}

