package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestonechat {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			//apply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			
			//handle hidden division pop up
			driver.findElement(By.id("denyBtn")).click();
			Thread.sleep(2000);
			
			//identify frame by using xpath  method
			WebElement frameElement=driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
			
			
			//handle the frame by switch the controls to the frame
			//driver.switchTo().frame(0); method 1
			
			//handle frame by using index   method 2
			//driver.switchTo().frame("fc_widget");
			
			//handle frame by using name or id     method 3
			driver.switchTo().frame(frameElement);
			
			WebElement chatBox=driver.findElement(By.id("chat-icon"));
			chatBox.click();
			
		
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id='chat icon']")))
		
			//switch the control again back to the main webpage
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			
			driver.findElement(By.id("chat-fc-name")).sendKeys("Sonali");
			Thread.sleep(2000);
			driver.findElement(By.id("chat-fc-email")).sendKeys("sonali.sangale1319@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("chat-fc-phone")).sendKeys("9999999999");
			Thread.sleep(2000);
			
			
			
			
			
			
			

	}
}
