package popupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeFileUpload {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("http://laptop-jqi535jj/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    Thread.sleep(2000);
    driver.findElement(By.name("pwd")).sendKeys("manager");
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
    
    Actions act=new Actions(driver);
    WebElement uploadButton=driver.findElement(By.xpath("//input[@name='formCustomInterface.logo'logo & color scheme']"));
    act.doubleClick(uploadButton).perform();
    
    Runtime.getRuntime().exec("./autoItPrograms/ActitimeFileUpload.exe");
	
    
		
	}

}
