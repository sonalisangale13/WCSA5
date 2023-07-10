package dropdowns; //USING SELECTION METHOD ONLY

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
WebElement multiselectDD = driver.findElement(By.id("menu"));
Select sel=new Select(multiselectDD);
sel.selectByIndex(1);//To select using index
//Thread.sleep(2000);
sel.selectByVisibleText("Pav Bhaji");//To select using visible text

sel.selectByValue("v4");//To select using value

	}

}
