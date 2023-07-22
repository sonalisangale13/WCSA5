package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//It is a webelement repository
	
	@FindBy(xpath="//*[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']")private WebElement pssTB;
	@FindBy(xpath="//*[contains(@class,'initial')]")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement checkbox;
	@FindBy(partialLinkText="Actimind Inc.")private WebElement actiMindLink;
	
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	
	

	//Utilization
	
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPssTB() {
		return pssTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
		
	


                 //Operational MEthods
public void validLoginMethod(String validUsername,String validPassword)
{
	usnTB.sendKeys(validUsername);
	pssTB.sendKeys(validPassword);
	loginButton.click();
	
}
}
                