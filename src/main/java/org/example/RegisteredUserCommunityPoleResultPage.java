package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisteredUserCommunityPoleResultPage extends Utils {
    String expectedUserVoteSuccessfully = "User Vote Successfully";

    public  void verifyRegisteredUserVoteSuccessfully(){
        String actualMessage =getTextFromElement(By.xpath("//div[@class='home-page-polls']"));
        System.out.println("My massage:" +actualMessage);

        Assert.assertEquals(actualMessage,expectedUserVoteSuccessfully);
    }
}
