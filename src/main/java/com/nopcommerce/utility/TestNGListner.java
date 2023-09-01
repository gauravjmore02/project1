package com.nopcommerce.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{

	public void onTestStart(ITestResult result) {
	    System.out.println("Test Starts"+result.getName());
	  }

	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Success"+result.getName());
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test Fails"+result.getName());
		  try {
			Util.screenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	 
	  public void onTestSkipped(ITestResult result) {
	   
		  System.out.println("Test Skipped"+result.getName());
	  }

	
	 
	 
	 
	  
	 
}
