package com.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentSparkReporter2 implements ITestListener 
{
	private ExtentSparkReporter sparkReporter;
	private ExtentReports extent;
	private ExtentTest test;

	public void onStart(ITestContext context)
	{
		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String repName = "Reporting"+timeStamp+".html";
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+repName);
		sparkReporter.config().setDocumentTitle("Automation report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);	
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer name"," local host");
		extent.setSystemInfo("Testernmae", "pava");
	}
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.PASS,"Test case PASSED is :" + result.getName());
	}
	
	public void onTestFailure(ITestResult result) 
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case FAILED is :" + result.getName());
		test.log(Status.FAIL,"Test case FAILED cause is :" + result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result )
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case Skipped is :" + result.getName());
	}
	
	
	public void onFinish(ITestContext context) 
	{
	 extent.flush();
	}
	
}
	