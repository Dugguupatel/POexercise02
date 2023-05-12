package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FbPage extends Utils {
    By _cookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
    By _closeButton = By.xpath("//div[@aria-label='Close']");
    By _email = By.xpath("//*[@id=\"login_form\"]/div[2]/div[1]/label/input");
    By _password = By.xpath("//*[@id=\"login_form\"]/div[2]/div[2]/label/input");
    By _login = By.xpath("//*[@id=\"login_form\"]/div[2]/div[3]/div/div/div[1]/div/span/span");

    public void verifyFbPage(){
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertEquals(currentURL,"https://www.facebook.com/nopCommerce");
        //Click on cookie for close cookies
        clickOnElements(_cookies);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_closeButton));
        clickOnElements(_closeButton);

        if(driver.findElements(_email).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        if(driver.findElements(_password).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        if(driver.findElements(_login).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        // Closing the Child Window.
        driver.close();
        //switching to parent window
        System.out.println("The verified elements are : ");

        String emailOrPhone =driver.findElement(_email).getDomAttribute("placeholder");
        System.out.println(emailOrPhone);
        String password = driver.findElement(_password).getAttribute("placeholder");
        System.out.println(password);
        List < WebElement> webElementList = driver.findElements(By.xpath("//div[@aria-label='Accessible login button']"));
        for (WebElement e : webElementList)
            System.out.println(e.getText());


    }

}
