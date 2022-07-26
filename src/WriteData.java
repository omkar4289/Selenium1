import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteData {

	public static void writeData(int r, int c, String val) throws IOException
	{
		String path="C:\\Users\\91913\\eclipse-workspace\\Selenium1\\TestData.xlsx";
		
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet22");
		
		XSSFRow row=sheet.createRow(r);
		XSSFCell cell=row.createCell(c);
		
		cell.setCellValue(val);
		
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		
		
		
		
		System.out.println("Written completed");
		
	}
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		int row=0;
		List<WebElement> ele=driver.findElements(By.xpath("//*[@id='product']//tbody//tr//td[3]"));
		for(WebElement li:ele)
		{
			String title=li.getText();
			writeData(row, 1, title);
			row++;
			
		}
		
		
		

	}

}
