package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {

	public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.facebook.com/");
				Thread.sleep(5000);
				//By Downcasting to RemoteWebDriver Class
				
				RemoteWebDriver rwd=(RemoteWebDriver)driver;
				File src = rwd.getScreenshotAs(OutputType.FILE);
			
				File dest=new File("./screenshots/Facebook.png");
						Files.copy(src, dest);
	}

}
