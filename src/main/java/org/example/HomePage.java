package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import static sun.security.util.Debug.args;

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
    By _productsList = By.cssSelector("div.products.grid h2");
    By _searchButton = By.xpath("//button[@class='button-1 search-box-button']");
    By _fbButton = By.xpath("//li[@class='facebook']");
    By _welComeMsg = By.xpath("//h2[text()='Welcome to our store']");
    By _searchPlaceHolderText = By.xpath("//input[@type='text']");
    By _news = By.xpath("//a[text()='nopCommerce new release!']");
    By _customerCurrencyButton = By.xpath("//select[@id='customerCurrency']");
    By _UsDollar = By.xpath("//select[@id=\"customerCurrency\"]/option[1]");
    By _Euro = By.xpath("//select[@id=\"customerCurrency\"]/option[2]");
    By _buildYourOwnComputer = By.xpath("//a[text()='Build your own computer']");


    String expectedWelcomeMsg = "Welcome to our store";
    String expectedWordMsg = "Nike";
    String expectedVoteMsg = "you can not vote";
    String expectedDollarCurrencyShouldBePrintOut = "US Dollar";
    String expectedEuroCurrencyShouldBePrintOut = "Euro";

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
    public void clickOnVoteButton() {
        clickOnElements(_voteButton);
        Alert alert = driver.switchTo().alert();
        //get text for excepted and actual message
        Assert.assertEquals(alert.getText(),"Please select an answer");
        alert.accept();
    }
    public void clickPoorButton() {clickOnElements(_PoorButton);}
    public void clickOnProductButton() {clickOnElements(_ProductButton);}
    public void clickOnLoginButton() {clickOnElements(_loginButton);
    }
    public void printProductTitle() {
       List < WebElement > productsList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e: productsList){
            System.out.println(e.getText());
        }
    }
    public void searchButton() {
        //Click on search button
        clickOnElements(_searchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please enter some search keyword");
        alert.accept();
    }
    public void clickOnFbButton() {
        String MainWindow = driver.getWindowHandle();
        //Click on Facebook
        clickOnElements(_fbButton);
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow)){
                driver.switchTo().window(ChildWindow);
            }
            String actualMessage = getTextFromElement(_welComeMsg);
            System.out.println("My massage:"+actualMessage);
            //Close URL
            Assert.assertEquals(actualMessage,expectedWelcomeMsg);
        }
    // Switching to Parent window
        // driver.switchTo().window(MainWindow);
}
    public void printOutCurrency() {
        selectElementByText(_UsDollar,"US Dollar");
            List<WebElement> actualCurrency = driver.findElements(By.cssSelector("span.price"));

            for (WebElement e : actualCurrency) {
                System.out.println(e.getText());

                String actualMessage = getTextFromElement(_UsDollar);
                System.out.println(" massage:"+actualMessage);// result will come out
                Assert.assertEquals(actualMessage,expectedDollarCurrencyShouldBePrintOut,"US Dollar");
            }
            selectElementByText(_Euro,"Euro");
            List<WebElement> actualCurrency1 = driver.findElements(By.cssSelector("span.price"));

            for (WebElement e : actualCurrency1) {
                System.out.println(e.getText());

                String actualMessage = getTextFromElement(_Euro);
                System.out.println(" massage:"+actualMessage);// result will come out
                Assert.assertEquals(actualMessage,expectedEuroCurrencyShouldBePrintOut,"Euro");
            }}

    public void searchFunctionality() {
        //Type in search bar
        typetext(_searchPlaceHolderText,"Nike");
        //click on search button
        clickOnElements(_searchButton);

        String actualMessage = getTextFromElement(By.xpath("//input[@value='nike']"));
        System.out.println("My massage:"+actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage,expectedWelcomeMsg);

    }
    public void clickOnNewsTitle() {
        //Click on news
        clickOnElements(_news);
    }
    public void clickOnBuildYourOwnComputer() {
        //Click on Product
        clickOnElements(_buildYourOwnComputer);

    }

}