package robotActions;

import java.awt.AWTException;                           //SUCCESSFUL
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();//handle pop up
			
			//to generate print pop up	
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_P);
		
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_P);
	     //---------------------------------- generated
	        
	        Thread.sleep(4000);
	        
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	       //-------------------------------------
	        
	      //SHIFT THE CONTROL TO THE CANCEL BUTTON USING TAB
	       for(int i=0;i<=9;i++)
	       {
		        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        robot.keyRelease(KeyEvent.VK_TAB);
	       }
	        Thread.sleep(2000);

	        //hit enter button
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}
