package pom;

public class ValidManagerTestCase extends BaseTest {

	public static void main(String[] args) {

		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib = new flib();
		
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		UsersPage up=new UsersPage();
		
		//perform valid login
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));

		//
	}

}
