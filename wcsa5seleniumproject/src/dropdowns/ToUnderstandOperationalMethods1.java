package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiselectDD);
		
		//2.getOptions Method using for loop
	 	List<WebElement>dropdownOptions = sel.getOptions();
	 	for(int i=0;i<dropdownOptions.size();i++)
	 	{
	 	String options=dropdownOptions.get(i).getText();
	 		System.out.println(options);
	 		Thread.sleep(1000);
	 	}
	 	//using for each loop
	 	List<WebElement>ops=sel.getOptions();
	 	for(WebElement we : ops)
	 	{
	 		String textOfOps=we.getText();
	 		System.out.println(textOfOps);
	 	}
	}
}