package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-jqi535jj/login.do");
		WebElement usn=driver.findElement(By.xpath("//input[@class='textField']"));
usn.sendKeys("manager");
	}

}
 




//ACTITIME LOGIN PAGE-SUCCESS