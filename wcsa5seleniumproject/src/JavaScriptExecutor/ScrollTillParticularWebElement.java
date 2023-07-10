package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

	   //apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the web application
		driver.get("https://www.selenium.dev/");
		//identify the web element
		WebElement newsElement =driver.findElement(By.xpath("//h2[text()='News']"));
		
		//to perform scrolling operation for a news elements
		Point loc=newsElement.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.ScrollBy("+xaxis+","+(yaxis-180)+")");

jse.executeScript("arguments[0].scrollIntoView(false)",newsElement);

	}

}
