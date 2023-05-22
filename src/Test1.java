import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 {

	public void captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\91913\\eclipse-workspace\\Selenium1\\Screenshot\\screen.png");
		FileHandler.copy(src, trg);
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		WebElement name=driver.findElement(By.id("name"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView();",name);
		
		name.sendKeys("Omkar");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alt=driver.switchTo().alert();
	String msg=	alt.getText();
	if(msg.contains("Omkar"))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case not passed");
	}
		
	alt.accept();
	
	Test1 obj1=new Test1();
    obj1.captureScreen(driver);
	
	}

}
