import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drager=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act=new Actions(driver);
		//act.clickAndHold(drager).moveByOffset(400, 0).build().perform();
        act.dragAndDrop(drager,drop).build().perform();

	}

}
