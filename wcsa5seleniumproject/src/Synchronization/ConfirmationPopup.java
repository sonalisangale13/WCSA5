package Synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/Asus/Desktop/wcsa5workspace/wcsa5seleniumproject/src/confirmation.html");
        
        //to generate confirmation popup click on submit button
        driver.findElement(By.tagName("input")).click();
        
        //handle confirmation popup by using switchTo()
        Thread.sleep(2000);
        Alert al=driver.switchTo().alert();
      //  al.accept();   //accept the confirmation popup
      //  al.dismiss();
        //dismiss the confirmation popup
        System.out.println(al.getText());
        al.accept();
        al.sendKeys("text");
	}

}
