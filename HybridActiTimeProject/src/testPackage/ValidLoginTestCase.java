package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)

public class ValidLoginTestCase<LoginPage> extends BaseTest{
	
	  private String EXCEL_PATH;
	private String INVALIDSHEET_NAME;
	private String PROP_PATH;



	@Test
	  public void validloginMethod() throws IOException 
	  {
		  // to perform login call the methods from LoginPage pom class
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	  }
	  
	  
	  
	  @Test(dependsOnMethods = "validloginMethod")
	  public void inValidLoginMethod() throws EventException, IOException, InterruptedException
	  {
		  LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  int rc = flib.getLastRowCount(EXCEL_PATH,INVALIDSHEET_NAME);
		  for(int i=1;i<=rc;i++)
		  {
			  lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,INVALIDSHEET_NAME,i,0),flib.readExcelData(EXCEL_PATH, INVALIDSHEET_NAME, i,1));
		  }

}
}