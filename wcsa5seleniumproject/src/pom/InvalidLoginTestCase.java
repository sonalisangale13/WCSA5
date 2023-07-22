package pom;

import java.io.IOException;

public class InvalidLoginTestCase  extends BaseTest{

	public static void main(String[] args) throws IOException {
 //launch the browser and application
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		//perform invalid login
		//go into the login page
		 LoginPage lp = new LoginPage(driver);
	}

}
