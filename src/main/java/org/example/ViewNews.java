package org.example;

import org.openqa.selenium.By;

public class ViewNews extends Utils{

    By _title = By.xpath("//input[@class='enter-comment-title']");
    By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    By _newComment = By.xpath("//*[@id=\"comments\"]/form/div[2]/button");
    //News comment is successfully added.
    ////div[@class='result']
    By _guestComment = By.xpath("//div[@class='comment news-comment'][2]");


public void enterLeaveYourComment(){
    typetext(_title,"Hello");
    typetext(_comment,"oye hellooooooooooooo");
    clickOnElements(_newComment);
    getTextFromElement(_guestComment);
}
}
