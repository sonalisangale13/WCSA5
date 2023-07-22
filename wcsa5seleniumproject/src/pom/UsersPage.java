package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {

	//store webelements of webpage
	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement userListCreateTB;
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement pssTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement retypePasssTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(name="rightGranted[12]]") private WebElement EnterTimeTrackChekBox;
	@FindBy(name="rightGranted[2]") private WebElement manageCust_projectCheckBox;
	@FindBy(name="rightGranted[1]") private WebElement generatesReportsCheckBox;
	@FindBy(name="rightGranted[5]") private WebElement manageUserCheckBox;
	@FindBy(name="rightGranted[7]") private WebElement manageBillingTypesCheckBox;
	public WebElement getUserListCreateTB() {
		return userListCreateTB;
	}
	public WebElement getUsnTB() {
		return usnTB;
	}
	public WebElement getPssTB() {
		return pssTB;
	}
	public WebElement getRetypePasssTB() {
		return retypePasssTB;
	}
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}
	public WebElement getLastNameTB() {
		return lastNameTB;
	}
	public WebElement getEnterTimeTrackChekBox() {
		return EnterTimeTrackChekBox;
	}
	public WebElement getManageCust_projectCheckBox() {
		return manageCust_projectCheckBox;
	}
	public WebElement getGeneratesReportsCheckBox() {
		return generatesReportsCheckBox;
	}
	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}
	public WebElement getManageBillingTypesCheckBox() {
		return manageBillingTypesCheckBox;
	}
	
	
	public void createManager(String username,String password)
	{
		userListCreatenewUserButton.click();
		Thread.sleep(1000);
		usnTB.sendKeys(username);
		pssTB.sendKeys(password);
		retypePassTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyEnterTimeTrackCheckBox.click();
		manageCust_projectCheckBox.click();
		generateReportsCheckBox();
		manageBillingTypesCheckBox.click();
		Thread.sleep(1000);
		createUserButton.click();
	}
	public void deleteManager();
	{
		usersLink.click();
		deleteThisUserButton.click();
	}
		
	}
	
}
