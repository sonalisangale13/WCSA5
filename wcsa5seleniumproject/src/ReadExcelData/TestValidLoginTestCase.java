package ReadExcelData;   //PENDING 

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://laptop-jqi535jj/login.do");

//read the data
         FileInputStream fis=new FileInputStream("./data/ActiTimeTestData.xlsx");
         Workbook wb = WorkbookFactory.create(fis);
 		Sheet sheet=wb.getSheet("validcreds");
 		Row row=sheet.getRow(1);
 		Cell cell=row.createCell(0);
		String validUsername=cell.getStringCellValue();
		
		Thread.sleep(2000);

		
		
		 FileInputStream fis2=new FileInputStream("./data/ActiTimeTestData.xlsx");
         Workbook wb1 = WorkbookFactory.create(fis2);
 		Sheet sheet1=wb1.getSheet("validcreds");
 		Row row1=sheet1.getRow(1);
 		Cell cell1=row1.createCell(0);
		String validPassword=cell1.getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(validPassword);
		Thread.sleep(2000);

		driver.findElement(By.name("loginButton")).click();

		
		
		
		
		}
	

}
