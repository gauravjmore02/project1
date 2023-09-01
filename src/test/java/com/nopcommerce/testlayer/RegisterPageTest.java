package com.nopcommerce.testlayer;

import org.testng.annotations.Test;

import com.nopcommerce.pagelayer.HomePage;
import com.nopcommerce.pagelayer.RegisterPage;
import com.nopcommerce.testbase.TestBase;

public class RegisterPageTest extends TestBase{

	@Test
	public void verifyTheRegisterPageFunctionality()
	{
		HomePage home_obj=new HomePage(driver);
		RegisterPage reg_obj=new RegisterPage(driver);
		
		home_obj.clickOnRegisterTab();
		reg_obj.clickOnMaleGenderButton();
		reg_obj.enterFirstName();
		reg_obj.enterLastName();
		reg_obj.selectDateOfBirthDay();
		reg_obj.selectDateOfBirthMonth();
		reg_obj.selectDateOfBirthYear();
		reg_obj.enterEmailId();
		reg_obj.entercompanyName();
		reg_obj.enterPassword();
		reg_obj.enterConformPassword();
		reg_obj.clickOnRegisterButton();
	}
}
