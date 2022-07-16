package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BaseTest;

public class Listeners extends BaseTest implements ITestListener {
	

	public void onTestFailure(ITestResult result) {
		
	
		try {
			ScreenShot.captureScreen(driver, result.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
