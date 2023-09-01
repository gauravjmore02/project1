package com.nopcommerce.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
	public ProductDisplayPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addToCart_button;
	
	@FindBy(xpath="((//button[text()='Add to wishlist'])[1]")
	private WebElement addToWishList_button;
	
	
	public void clickOnAddToCartButton()
	{
		addToCart_button.click();
	}

	public void clickOnAddToWishListButton()
	{
		addToWishList_button.click();
	}
}
