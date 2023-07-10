package takesScreenshot;                   //PENDING

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay4 {
	//BY USING EVENTFIRINGWEBDRIVER

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        RemoteWebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
			driver.get("https://www.selenium.dev/downloads/");
			
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	   File	src= efw getScreenshotAs(OutputType.FILE);
	   File dest= new File("./screenshots/screenshot4.png");
	   Files.copy(src, dest);
	}

}
