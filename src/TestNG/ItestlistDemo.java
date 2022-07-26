package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestlistDemo implements ITestListener {

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started");
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Finished");
	}
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(" On Test Start");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test Success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Fail");
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}
	
}
