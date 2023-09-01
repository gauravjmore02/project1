package com.nopcommerce.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register_tab;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement logIn_tab;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCart_tab;
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchBar;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishList_Tab;
	
	
	
	public void clickOnRegisterTab()
	{
		register_tab.click();
	}
	
	public void clickOnLogInTab()
	{
		logIn_tab.click();
	}
	public void clickOnShoppingCartTab()
	{
		shoppingCart_tab.click();
	}
	
	public void searchTheproduct()
	{
		searchBar.sendKeys("Phones"+Keys.ENTER);
	}
	
	public void clickWishlistTab()
	{
		wishList_Tab.click();
	}
}
