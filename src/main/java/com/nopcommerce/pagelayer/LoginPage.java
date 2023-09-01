package com.nopcommerce.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement logIn_button;
	
	public void enterEmailIdtoLogIn()
	{
		email_txtbox.sendKeys("abc123@gmail.com");
	}
	
	public void enterPasswordToLogIn()
	{
		password_txtbox.sendKeys("12345678");
	}
	
	public void clickOnLoginButton()
	{
		logIn_button.click();
	}
}
