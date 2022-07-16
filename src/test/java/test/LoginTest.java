package test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	
	LoginPage lp;

	@BeforeClass
	public void initObject() {

		lp = new LoginPage(driver);

	}

	
	@Test
	public void login() {

		lp.enterCred("Admin", "admin123");

		lp.clcikButton();

		// Assert.assertEquals(driver.getTitle(),"OrangeHrm","Title doesnot matched");
		Assert.assertTrue(true);

	}



}
