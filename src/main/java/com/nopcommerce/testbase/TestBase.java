package com.nopcommerce.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nopcommerce.utility.ExtentReporterNG;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends ExtentReporterNG {
 
	public static WebDriver driver;
public static Logger logger;
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("Opencart Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Execution started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Execution ended");
		logger.info("--------------------------------------------------------------");
	}
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
