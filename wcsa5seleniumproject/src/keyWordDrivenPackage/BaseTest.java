package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest extends Flib  {

	//It is used to open and close the browser
	
	public void openBrowser() throws IOException {
		Flib flib=new Flib();
	String browserValue=flib.readPropertyData("./data/config.properties", "Browser");
	String url=flib.readPropertyData("./data/configproperties", "Url");
	
	RemoteWebDriver driver;
	String ifbrowserValue;
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chrome")
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().
		driver.get(url);
	}
	else ifbrowserValue.equalsIgnoreCase("Firefox");
	{
		
		System.setProperty("webdriver.gecko.driver","./drivers/chrome")
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().
		driver.get(url);
		
		
		
		
		System.setProperty("webdriver.edge.driver","./drivers/chrome")
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().
		driver.get(url);
	
	}
	
	
		
		
	}
	
}
