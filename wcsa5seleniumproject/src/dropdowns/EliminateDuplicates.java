package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EliminateDuplicates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("");
		//identify dropdown
		WebElement dropDownElement=driver.findElement(By.id("i1"));
		
		//handle dropdown
		Select sel=new Select(dropDownElement);
		HashSet<String>hs=new HashSet<String>();
		
	}

}
