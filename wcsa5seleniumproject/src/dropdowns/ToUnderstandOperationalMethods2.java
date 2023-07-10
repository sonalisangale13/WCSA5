package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select sel=new Select(multiselectDD);
		
		//3.By using getfirstselectedoption
	 	for(int i=2;i<=4;i++)
	 	{
	 	sel.selectByIndex(i);
	 	
	}
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("First Selected Option Is:"+firstOption.getText());
}
}

