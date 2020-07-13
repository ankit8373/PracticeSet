package com.evs.testng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class myTestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("Test case "+result.getName()+"Successfully start");
		System.out.println("Test case "+result.getName()+"Successfully start");
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case "+result.getName()+"Successfully passed");
		System.out.println("Test case "+result.getName()+"Successfully passed");
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case "+result.getName()+"failed");
		System.out.println("Test case "+result.getName()+"failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
