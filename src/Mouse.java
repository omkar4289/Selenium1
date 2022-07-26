import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubles=driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubles).perform();
		//Thread.sleep(3000);
		if(driver.findElement(By.id("doubleClickMessage")).getText().equals("You have done a double click")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Failed");
		}
		act.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
		if(driver.findElement(By.id("rightClickMessage")).getText().equals("You have done a right click")) {
			System.out.println("Right click passed");
		}
		else
		{
			System.out.println("Right click failed");
		}
		act.click(driver.findElement(By.xpath("//*[@class='mt-4']/following-sibling::div/button"))).perform();
        if(driver.findElement(By.id("dynamicClickMessage")).getText().equals("You have done a dynamic click")) {
        	System.out.println("Clicked successfully");
        }
        else
        {
        	System.out.println("Clicked failed");
        }
	}

}
