package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGClass1 {

	public static WebDriver driver;
	
	
	  @Parameters("browser")
	  
	  @BeforeTest(alwaysRun = true) 
	  public void openBrowser(String BrowserName) {
	  if(BrowserName.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Development\\chromedriver.exe");
	  
	  driver=new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/draggable/"); } else
	  if(BrowserName.equals("firefox")) { System.out.println("Open Firefox"); }
	  else { System.out.println("Wrong info"); } }
	  
	  @Test(groups="smoke") 
	  public void verifyTitle() { String
	 title=driver.getTitle();
	  
	  Assert.assertEquals(title,"Draggable | jQuery UI"); }
	  
	  @Test(groups="smoke")
	  public void verifyUrl() { String
	  Url=driver.getCurrentUrl();
	  
	  Assert.assertEquals(Url,"https://jquer"); }
	 
	 @Test(groups="sanity")
	 public void TestCase1()
	{
		System.out.println("TestCase 1");
	}
	@Test(groups="sanity")
	public void TestCase2()
	{
		System.out.println("TestCase 2");
	}
}
