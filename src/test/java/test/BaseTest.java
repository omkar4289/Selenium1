package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	
	public static WebDriver driver;
  
  @BeforeSuite
  public void initBrowser() {
	  //added dummy comment
	  WebDriverManager.chromedriver().setup();
	  
	  //added comment here

		// Step -1 Launch browser
		driver = new ChromeDriver();

		// step-2 max window
		driver.manage().window().maximize();

		// step-3 open web application
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		// step-4 dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterSuite
  public void tearDown() {
	  
	  driver.quit();
  }

}
