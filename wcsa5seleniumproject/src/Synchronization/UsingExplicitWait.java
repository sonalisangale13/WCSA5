package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();//launch browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(60));
	
	driver.get("https://www.shoppersstack.com/products_page/739");
	driver.findElement(By.xpath("//img[@alt="men"]")).click();
	
	driver.findElement(By.linkText("Mobiles")).click();
	
	driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();

	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("idontknow");
explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']"))).click();
}
}
