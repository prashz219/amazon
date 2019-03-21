package com.amazon.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.amazon.base.Page;
import com.relevantcodes.extentreports.LogStatus;
import com.amazon.utilities.Utilities;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {

		test = rep.startTest(result.getName().toUpperCase());

	}

	public void onTestSuccess(ITestResult result) {
		// Extent Report
		test.log(LogStatus.PASS, result.getName().toUpperCase() + " : Passed");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailure(ITestResult result) {

		// Extent Report
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with exception: " + result.getThrowable());
		
		// Appending screenshot to extent report
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));
				
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 width=200></img></a>");
		
		rep.endTest(test);
		rep.flush();

		
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

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

	}

}
