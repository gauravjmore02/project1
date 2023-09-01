package com.nopcommerce.testlayer;

import org.testng.annotations.Test;

import com.nopcommerce.pagelayer.HomePage;
import com.nopcommerce.pagelayer.ProductDisplayPage;
import com.nopcommerce.pagelayer.ProductPage;
import com.nopcommerce.testbase.TestBase;

public class WishListFunctionality extends TestBase {

	@Test
	public void verifyTheWishListFunctionality()
	{
		HomePage home_obj=new HomePage(driver);
		ProductPage prod_obj=new ProductPage(driver);
		ProductDisplayPage pdp_obj=new  ProductDisplayPage(driver);
		
		home_obj.searchTheproduct();
		prod_obj.clickOnNokiaLumina1020Phone();
		pdp_obj.clickOnAddToWishListButton();
		home_obj.clickWishlistTab();
	}
}
