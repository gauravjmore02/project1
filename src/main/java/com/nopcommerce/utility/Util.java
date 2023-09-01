package com.nopcommerce.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.nopcommerce.testbase.TestBase;

public class Util extends TestBase {
	
	public static void screenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\LENOVO-PC\\eclipse-workspace\\Demo1\\ScrenShot\\"+System.currentTimeMillis()+".jpeg");
		
		FileHandler.copy(src, des);
	}

}
