package testNGPackage;          //suite name-firsttesting in test output-serial wise output

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() throws InterruptedException 
  
  {
	  
	//  System.out.println("This is Demo TestNG Class!!");
	 
	//  Reporter.log("This is Demo TestNG Class!!");
	  
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.co.in/");
driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
Thread.sleep(2000);
driver.quit();
Reporter.log("This is Demo TestNG class!!",true);
  }
}




