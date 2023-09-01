package com.nopcommerce.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Nokia Lumia 1020'])[2]")
	private WebElement nokiaLumina1020_phone;
	
	public void clickOnNokiaLumina1020Phone()
	{
		nokiaLumina1020_phone.click();
	}
}
