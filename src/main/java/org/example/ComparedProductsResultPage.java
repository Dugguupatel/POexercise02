package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComparedProductsResultPage extends Utils {
    String expectedCompareCompleteMsg = "You have no items to compare.";
    public void verifyUserCompareProductsSuccessfully(){
        String actualMessage = getTextFromElement(By.xpath("//div[@class='no-data']"));
        System.out.println("My message: "+actualMessage);

        Assert.assertEquals(actualMessage,expectedCompareCompleteMsg);
    }


}
