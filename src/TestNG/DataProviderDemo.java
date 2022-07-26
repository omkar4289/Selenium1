package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider="TestData")
	public void login(String email,String pass) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();
		
	}
	
	@DataProvider (name="TestData")
	public Object[][] redData()
	{
		return new Object[][] {{"abc@test.com","123456"},{"abc@gmail.com","12qw3"}};
	}

}
