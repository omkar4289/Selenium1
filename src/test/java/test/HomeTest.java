package test;

import java.time.Duration;



import java.lang.reflect.Method;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import java.util.logging.Logger;

public class HomeTest extends BaseTest {
	
	HomePage hp; 
	LoginPage lp;
	
	   
	 @BeforeClass
	
	  public void initObject() {
		  
		  hp=new HomePage(driver);
		  
		  lp=new LoginPage(driver);
	
		  
		  lp=new LoginPage(driver);
		 
	  }
	 
  @Test
  public void logout() {
	
	  hp.logout();
	
  }
 


  

}
