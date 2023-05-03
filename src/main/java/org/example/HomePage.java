package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _registerButton = By.xpath("//a[text()='Register']");
    By _electronics = By.xpath("(//a[text()='Electronics '])[1]");
    By _CompareButton = By.xpath("(//button[@title='Add to compare list'])[3]");
    By _CompareButton2 = By.xpath("(//button[@title='Add to compare list'])[4]");
    By _ProductComparedButton = By.xpath("//a[text()='product comparison']");
    By _GoodButton = By.xpath("(//input[@id='pollanswers-2'])");
    By _voteButton = By.xpath("//button[@id='vote-poll-1']");
    By _PoorButton = By.xpath("//input[@id='pollanswers-3']");
    By _ProductButton = By.xpath("//a[text()='Apple MacBook Pro 13-inch']");  //Email a friend product Apple Macbook
    By _loginButton = By.xpath("//a[text()='Log in']");
    public void clickOnRegisterButton(){
        clickOnElements(_registerButton);
    }
    public void clickOnElectronicsButton() {
        clickOnElements(_electronics);
    }
    public void clickOnCompareButton() { clickOnElements(_CompareButton);}
    public void clickOnCompareButton2() {
        clickOnElements(_CompareButton2);
    }
    public void clickOnProductComparedButton() {
        clickOnElements(_ProductComparedButton);
    }
    public void clickOnGoodButton() {clickOnElements(_GoodButton);}
    public void clickOnVoteButton() {clickOnElements(_voteButton);}
    public void clickPoorButton() {clickOnElements(_PoorButton);}
    public void clickOnProductButton() {clickOnElements(_ProductButton);}
    public void clickOnLoginButton() {clickOnElements(_loginButton);
    }
}
