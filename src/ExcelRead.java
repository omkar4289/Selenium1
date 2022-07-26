import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static String ReadData(int r,int c) throws IOException {
		String path="C:\\Users\\91913\\eclipse-workspace\\Selenium1\\TestData.xlsx";
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		//System.out.println(sheet.getRow(0).getCell(0));
		//Row row1 = sheet.getRow(0);
		//Cell cell1 = row1.getCell(1);
		//System.out.println(sheet.getRow(0).getCell(1));
		return cell.getStringCellValue();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(ReadData(0,0));
		driver.findElement(By.id("txtPassword")).sendKeys(ReadData(0,1));
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		System.out.println(ReadData(0,0));
		System.out.println(ReadData(0,1));
		
		//String cellval = cell.getStringCellValue();
	    

	}

}
