package org.example;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CommunityPole communityPole = new CommunityPole();
    CommunityPoleResultPage communityPoleResultPage = new CommunityPoleResultPage();
    CompareProducts compareProducts = new CompareProducts();
    ComparedProductsResultPage comparedProductsResultPage = new ComparedProductsResultPage();
    CheckShoppingCart checkShoppingCart = new CheckShoppingCart();
    Email_A_Friend email_a_friend = new Email_A_Friend();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    RegisteredUserCommunityPole registeredUserCommunityPole = new RegisteredUserCommunityPole();
    RegisteredUserCommunityPoleResultPage registeredUserCommunityPoleResultPage = new RegisteredUserCommunityPoleResultPage();
    RegisteredUserEmailAFriend registeredUserEmailAFriend =new RegisteredUserEmailAFriend();
    RegisteredUserEmailAFriendResultPage registeredUserEmailAFriendResultPage = new RegisteredUserEmailAFriendResultPage();

    @Test       //Registration page
    public void verifyUserShouldBeAbleToRegistrationSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //Type first name
        registerPage.enterRegistrationDetails();
        //verify user registered successfully
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Test       // Compare Products
    public void verifyUserShouldAbleToCompareProductsSuccessfully() {
        //Click on 1st product
        homePage.clickOnCompareButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on 2nd product
        homePage.clickOnCompareButton2();
        //click on comparison button
        homePage.clickOnProductComparedButton();
        //click on Clear button
        compareProducts.clickOnClearListButton();
        //click on Products compare successfully
        comparedProductsResultPage.verifyUserCompareProductsSuccessfully();
    }
    @Test       //Polling Vote
    public void verifyUserShouldAbleToVoteSuccessfully(){
        //click on GOOD-Polling button
        homePage.clickOnGoodButton();
        //click on VOTE-Polling button
        homePage.clickOnVoteButton();
        //click on POOR-Polling button
        //homePage.clickPoorButton();
        //click on VOTE-Polling button
        //homePage.clickOnVoteButton();
        communityPole.userVerifyCommunityPoleSuccessfully();
        communityPoleResultPage.verifyCommunityPoleSuccessfully();
    }
    @Test       //Check Shopping Cart
    public void verifyUserShouldAbleToCheckShoppingCartSuccessfully(){
        //click on ELECTRONICS button
        homePage.clickOnElectronicsButton();
        //click on Shopping Cart button
        checkShoppingCart.fillingShoppingDetails();
    }
    @Test       //Email a Friends
    public void verifyUserShouldAbleToEmailAFriendSuccessfully(){
        //Click on Product
        homePage.clickOnProductButton();
        //click on Email a Friend Button
        email_a_friend.enterProductsDetailForEmailAFriend();
        //Verify user email a friend successfully
        emailAFriendResultPage.verifyUserEmailAFriendSuccessfully();
    }
    @Test       //Registered User Vote Successfully
    public void verifyRegisteredUserPoleSuccessfully(){
        //click on LogIn button
        homePage.clickOnLoginButton();
        //Enter Login Details
        registeredUserCommunityPole.enterLoginDetails();
        //verify user Vote successfully
        registeredUserCommunityPoleResultPage.verifyRegisteredUserVoteSuccessfully();
    }
    @Test       //Registered User Email a friend successfully
    public void verifyRegisteredUserEmailAFriendSuccessfully(){
        homePage.clickOnLoginButton();
        registeredUserEmailAFriend.enterRegisteredDetails();
        homePage.clickOnProductButton();
        registeredUserEmailAFriendResultPage.verifyUserEmailAFriendSuccessfully();

    }

}
