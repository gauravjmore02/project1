package com.nopcommerce.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
 
	public static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.operadriver().setup();
		
		driver = new OperaDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
