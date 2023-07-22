package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static void main(String[] args) {

		//store all the home page modules
		@FindBy(xpath="//div[.='Time-Track']/../descendant::img") private WebElement timetrackModule;
		@FindBy(xpath="//div[text()='Tasks']/following-sibling::img")private WebElement tasksModule;
	 @FindBy(xpath=	"//div[text()='Reports']/following-sibling::img")private WebElement reportsModule;
	 @FindBy(xpath="//div[text()='Users']/following-sibling::img")private WebElement usersModule;
	 @FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img")private WebElement workScheduleModule;
	 @FindBy(xpath="//div[text()='Settings']/following-sibling::img") private WebElement settingModule;
	 @FindBy(xpath="//a[text()='Logout']")private WebElement logOutLink;
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		
	}

		public WebElement getTimetrackModule() {
			return timetrackModule;
		}

		public WebElement getTasksModule() {
			return tasksModule;
		}

		public WebElement getReportsModule() {
			return reportsModule;
		}

		public WebElement getUsersModule() {
			return usersModule;
		}

		public WebElement getWorkScheduleModule() {
			return workScheduleModule;
		}

		public WebElement getSettingModule() {
			return settingModule;
		}

		public WebElement getLogOutLink() {
			return logOutLink;
		}
	
		public WebElement clickOnTimeTrackModule()
		{
			timeTrackModule.click();
		}
		
		public WebElement 
			
			
		public void clickOnWorkScheduleModule()
		{
			workScheduleModule.click();
		}
		
		public void clickOnSetting()
		{
			settingModule.click();
		}
		
		
		}
		}

}
