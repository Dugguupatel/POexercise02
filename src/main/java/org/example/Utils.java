package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Utils extends BasePage {
    public  static void clickOnElements(By by){
        driver.findElement(by).click();
    }
    public static void typetext(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by) {return driver.findElement(by).getText();}
//        String actualMessage = driver.findElement(by).getText();
//        return actualMessage;
//    }
    public static long timestamp (){
        Timestamp timestamp1= new  Timestamp (System.currentTimeMillis());
        return timestamp1.getTime();
    }
}
