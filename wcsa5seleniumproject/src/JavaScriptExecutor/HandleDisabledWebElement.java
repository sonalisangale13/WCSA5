package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

	   //apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the web application
			driver.get("file:///C:/Users/Asus/Desktop/wcsa5workspace/wcsa5seleniumproject/wcsa5seleniumproject/java%20selenium%20code/disabled.html");
			
			//identify web element
			driver.findElement(By.id("i1")).sendKeys("admin");
			driver.findElement(By.id("i2")).sendKeys("manager");
			Thread.sleep(2000);
			
			//to perform scrolling operation
			JavascriptExecutor jse=(JavascriptExecutor)driver;
	//generate alert pop up
			jse.executeScript("alert('Hello there');");
			
			//To handle disabled WebElement
			jse.executeScript("document.getElementById(i2).value='manager'");
	}
	

}
