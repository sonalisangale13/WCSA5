package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown3 {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("file:///C:/Users/Asus/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
			WebElement multiselectDD = driver.findElement(By.id("menu"));
			Select sel=new Select(multiselectDD);
			sel.selectByIndex(1);//To select using index
			//Thread.sleep(2000);
			sel.selectByVisibleText("Paani Puri");//To select using visible text

			sel.selectByValue("v5");//To select using value
			
			//to deselect using index
			sel.deselectByIndex(3);
			
			//to deselect using VisibleText
			sel.deselectByVisibleText("Misal Pav");
			
			//to deselect using Value
            sel.deselectByValue("v5");
            
            Thread.sleep(2000);
            //TO SELECT MULTIPLE OPTIONS
            for(int i=0;i<5;i++)
            {
            	sel.selectByIndex(i);
            	Thread.sleep(1000);
            }
            
            //TO DESELECT MULTIPLE OPTIONS

//Thread.sleep(3000);
//for(int i=0;i<5;i++)

	//sel.deselectByIndex(i);
	//Thread.sleep(1000);
            sel.deselectAll();
}

	
		

}






