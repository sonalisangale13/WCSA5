package popupHandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/Asus/Desktop/wcsa5workspace/wcsa5seleniumproject/src/alert%20popup.html");
        
        //to generate pop up click on button
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        
      //  Robot robot=new Robot;
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);
       //Thread.sleep(2000);
       //robot.keyPress(KeyEvent.VK_ENTER);
       //robot.keyRelease(KeyEvent.VK_ENTER);
       
       //to handle alert popup by switchTO()
      Alert al= driver.switchTo().alert();
      Thread.sleep(2000);
     // al.accept(); to accept the alert popup
      
     // al.dismiss();  to dismiss the alert popup
      System.out.println(al.getText());  //alert the text of alert popup
      

	}

}
