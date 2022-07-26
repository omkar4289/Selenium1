package TestNG;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.ItestlistDemo.class)
public class listenerDemo {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
         System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login() throws InterruptedException, IOException 
	  {
		driver.findElement(By.id("email")).sendKeys("abdccf");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(System.getProperty("user.dir")+"\\Screenshot\\one.png");
		FileHandler.copy(src, trg);
       }
	
	@Test
	public void TestToFail() {
		Assert.assertTrue(false);
	}

	
}
