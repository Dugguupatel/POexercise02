package org.example;

import org.openqa.selenium.By;

public class CompareProducts extends Utils{
//    By _CompareButton = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]");
//    By _CompareButton2 = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4])");
//    By _ProductComparedButton = By.xpath("//a[text()='product comparison']");
    By _ClearListButton = By.xpath("//a[text()='Clear list']");

    public void clickOnClearListButton(){
//Click on compare button of HTC One Android L 5.0 lollipop
//        clickOnElements(_CompareButton);
//        //Click on compare button of $25 Virtual Gift Card
//        clickOnElements(_CompareButton2);
        //getText for compared products
//        String actualMessage = getTextFromElement(By.className("content"));
//        System.out.println("My message: "+actualMessage);
        //click on Product compare button
        //clickOnElements(_ProductComparedButton);
        //Click on Clear List button
        clickOnElements(_ClearListButton);

    }


}
