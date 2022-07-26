import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void selectDate(String month1,int date) {
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String monthValue=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		    if(!monthValue.equals(month1)) {
		    	driver.findElement(By.xpath("//a[@title='Prev']")).click();
		    	
		    }
		    else {
		    	break;
		    }
		
		
		}
		
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();


		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectDate("May 2021", 10);
        	}

}
