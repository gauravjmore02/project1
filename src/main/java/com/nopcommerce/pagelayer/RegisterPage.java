package com.nopcommerce.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement gender_button;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstName_txtbox;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastName_txtbox;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	private WebElement DOB_Day_txtbox;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	private WebElement DOB_Month_txtbox;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	private WebElement DOB_year_txtbox;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='Company']")
	private WebElement companyname_txtbox;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement conformPassword_txtbox;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement register_button;
	
	public void clickOnMaleGenderButton()
	{
		gender_button.click();
	}
	
	public void enterFirstName()
	{
		firstName_txtbox.sendKeys("omkar");
	}
	
	public void enterLastName()
	{
		lastName_txtbox.sendKeys("kale");
	}
	
	public void selectDateOfBirthDay()
	{
		Select s=new Select(DOB_Day_txtbox);
		s.selectByVisibleText("1");
	}
	
	public void selectDateOfBirthMonth()
	{
		Select s=new Select(DOB_Month_txtbox);
		s.selectByVisibleText("May");
	}
	
	public void selectDateOfBirthYear()
	{
		Select s=new Select(DOB_year_txtbox);
		s.selectByVisibleText("2000");
	}
	
	public void enterEmailId()
	{
		email_txtbox.sendKeys("abc123@gmail.com");
	}
	
	public void entercompanyName()
	{
		companyname_txtbox.sendKeys("company xyz");
	}
	
	public void enterPassword()
	{
		password_txtbox.sendKeys("12345678");
	}
	
	public void enterConformPassword()
	{
		conformPassword_txtbox.sendKeys("12345678");
	}
	
	public void clickOnRegisterButton()
	{
		register_button.click();
	}
}
