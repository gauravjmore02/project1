package com.nopcommerce.testlayer;

import org.testng.annotations.Test;

import com.nopcommerce.pagelayer.HomePage;
import com.nopcommerce.pagelayer.LoginPage;
import com.nopcommerce.testbase.TestBase;

public class LogInFunctionality extends TestBase {
	
	@Test
	public void verifyTheLoginFunctionalityUsingValidCredencial()
	{
		HomePage home_obj=new HomePage(driver);
		LoginPage logIn_obj=new LoginPage(driver);
		
		home_obj.clickOnLogInTab();
		logIn_obj.enterEmailIdtoLogIn();
		logIn_obj.enterPasswordToLogIn();
		logIn_obj.clickOnLoginButton();
		
	}

}
