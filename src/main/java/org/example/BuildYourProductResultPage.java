package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourProductResultPage extends Utils{

    String expectedBuildYourProductAddToCartCompleteMsg = "The product has been added to your shopping cart";

    public void verifyUserBuildYourProductSuccessfully() {
        String actualMessage = getTextFromElement(By.xpath("//div[@class='bar-notification success']"));
        System.out.println("My massage:"+actualMessage);
        //Assert - The product has been added to your shopping cart
        Assert.assertEquals(actualMessage,expectedBuildYourProductAddToCartCompleteMsg);
    }
}
