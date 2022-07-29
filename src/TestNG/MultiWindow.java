package TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String ParentWindow=driver.getWindowHandle();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@id='social-icons']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='social-icons']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@id='social-icons']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='social-icons']/a)[4]")).click(); 
		
		Set<String> list=driver.getWindowHandles();
		List<String> al=new ArrayList<String>(list);
		
		
		
		driver.switchTo().window(al.get(4));
		System.out.println(driver.getTitle());
		
		
		/*
		 * for(String id:list) { String title=driver.switchTo().window(id).getTitle();
		 * if(title.equals("OrangeHRM - World's Most Popular Opensource HRIS")) {
		 * System.out.println("Page found"); } }
		 */
		
		
		
		
		
		

	}

}
