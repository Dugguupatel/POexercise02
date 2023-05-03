package org.example;

import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{

    DriverManager driverManager = new DriverManager();
    @BeforeMethod
    public void setup(){
        driverManager.openBrowser();
    }


//    @AfterMethod
//    public void teardown(){
//        driverManager.closeBrowser();
//    }


}
