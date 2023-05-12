package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class Utils extends BasePage {
    public static void clickOnElements(By by) {
        driver.findElement(by).click();
    }

    public static void typetext(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //        String actualMessage = driver.findElement(by).getText();
//        return actualMessage;
//    }
    public static long timestamp() {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();
    }

    public static void selectElementByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

    public static void selectElementByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectElementByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void waitForClickable(By by, int time) {
        driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
    }
    public static void getAlert(){
        Alert alert = driver.switchTo().alert();
    }
    public static void popUpWindow(){
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().getText();

    }


}