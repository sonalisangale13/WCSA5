package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    EdgeDriver cdriver=new EdgeDriver();
		cdriver.manage().window().maximize();

		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
			cdriver.get("https://www.selenium.dev");
			
			File src = cdriver.getScreenshotAs(OutputType.FILE);
			
			File dest=new File("./screenshots/screenshot3.jpg");
			
			
			Files.copy(src, dest);
	}

}
