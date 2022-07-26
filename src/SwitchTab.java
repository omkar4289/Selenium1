import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		String ParentTab=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id='opentab']")).click();
		Set<String> tabs=driver.getWindowHandles();
		
		for(String id:tabs)
		{
			driver.switchTo().window(id);
			System.out.println(id);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(ParentTab);
		
		driver.switchTo().newWindow(WindowType.WINDOW);

	}

}
