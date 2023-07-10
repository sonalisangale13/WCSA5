package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
			WebElement multiselectDD = driver.findElement(By.id("menu"));
			Select sel=new Select(multiselectDD);
			
			//isMultiple Method-to check dropdown belongs to single or multi select~operational method
		
			boolean result=sel.isMultiple();
			System.out.println(result);
			
			
	 	
	 	
		
		}

}