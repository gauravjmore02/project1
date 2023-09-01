package com.nopcommerce.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='remove-btn']")
	private WebElement removeProduct_button;
	
	public void clickOnRemoveProductButton()
	{
		removeProduct_button.click();
	}

}
