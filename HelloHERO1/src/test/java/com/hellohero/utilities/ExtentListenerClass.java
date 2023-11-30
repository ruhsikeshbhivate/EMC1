package com.hellohero.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReports()
	{
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "OTS Portal Test Reports" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		ReadConfig readConfig = new ReadConfig();
		
		reports.setSystemInfo("machine", "LAPTOP-B8TJUCIE");
		reports.setSystemInfo("os", "window 11 pro");
		reports.setSystemInfo("browser", readConfig.getBrowser());
		reports.setSystemInfo("user name", "Rushi Bhivate");
		
		htmlReporter.config().setDocumentTitle("Extent Listner Demo Title");
		htmlReporter.config().setReportName("Reports on OTS Portal");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	public void onStart(ITestContext Result)
	{
		configureReports();
		System.out.println("On start method invoked");
	}
	
	public void onFinish(ITestContext Result)
	{
		System.out.println("On finished method invoked");
		reports.flush();
	}
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of the test method failed: " + Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + Result.getName(), ExtentColor.RED));
	    
		String screenShotPath = System.getProperty("user.dir") + "\\ScreenShots" + Result.getName() + ".png";
		File screenshotFile = new File(screenShotPath);
		
		if(screenshotFile.exists())
		{
			test.fail("Captured screenshot is below : " + test.addScreenCaptureFromPath(screenShotPath));
		}
	}
		
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Name of the test method skipped:" + Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + Result.getName(), ExtentColor.YELLOW));
	}
	
	//When test case get started, this method is called....
	public void onTestStart(ITestContext Result)
	{
		System.out.println("Name of test method started: " + Result.getName());
	}
	
	//When test case get passed, this method is called....
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of the test method pass:" + Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the success test case is: " + Result.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailedButWithSuccessPercentage(ITestResult Result)
	{
		
	}	
}
