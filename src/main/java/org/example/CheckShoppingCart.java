package org.example;

import org.openqa.selenium.By;

public class CheckShoppingCart extends Utils {
    By _CameraButton = By.xpath("(//li[@class='inactive'])[2]");
    By _ProductTitle = By.xpath("//a[text()='Leica T Mirrorless Digital Camera']");
    By _QuantityInput = By.xpath("//input[@id='product_enteredQuantity_16']");
    By _ProductQuantity = By.xpath("//input[@id='product_enteredQuantity_16']");
    By _AddToCart = By.xpath("//button[@id='add-to-cart-button-16']");
    By _ShoppingCart = By.xpath("//span[@class='cart-label']");
    By _OrderSummary = By.xpath("//div[@class='order-summary-content']");


    public void fillingShoppingDetails() {
        //Click on camera & photo
        clickOnElements(_CameraButton);
        //Click on product title Leica T Digital Camera
        clickOnElements(_ProductTitle);
        //Click in Quantity Box
        clickOnElements(_QuantityInput);
        //Enter Products Quantity
        typetext(_ProductQuantity, "1");
        //Click on Add to cart
        clickOnElements(_AddToCart);
        //Click on Shopping cart
        clickOnElements(_ShoppingCart);
        //Get Text The product has been added to your
        getTextFromElement(_OrderSummary);

    }
}