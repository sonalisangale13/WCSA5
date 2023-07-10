package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/SingleSelectDropdown.html");
		
		//identify dropdown on web page
		WebElement dropDownElement=driver.findElement(By.id("menu"));
		
		//handle the dropdown by creating obj of select
		Select sel=new Select(dropDownElement);
		
		//select the option form dropdown
		//use selection method
		Thread.sleep(2000);
		sel.selectByIndex(2);//from single select dropdown
		
		Thread.sleep(2000);
//try to deselect given option from dropdown-will get excetion as u can only deselect option in multi select only
	sel.deselectByIndex(2);
	}

}
