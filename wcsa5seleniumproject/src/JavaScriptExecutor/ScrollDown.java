package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

	   //apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//launch the web application
			driver.get("https://www.selenium.dev/");
			
			//to perform scrolling operation
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			
			//to scroll down
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,1000)");
	}

}
