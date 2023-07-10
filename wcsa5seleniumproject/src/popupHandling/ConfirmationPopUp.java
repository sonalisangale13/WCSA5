package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/Asus/Desktop/wcsa5workspace/wcsa5seleniumproject/src/confirmation.html");
        
        //To generate the confirmation pop up click on submit button
        driver.findElement(By.tagName("input")).click();
        //or
        //By.xpath("//input[@type='submit']"); 
        
        //Handle confirmation popup by using switchTo()
        Thread.sleep(2000);
        Alert al=driver.switchTo().alert();
        //al.accept();//Accept the confirmation popup
        //al.dismiss();//Dismiss the confirmation pop up
        System.out.println(al.getText());
        al.accept();
	}

}
