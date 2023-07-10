package keyWordDrivenPackage;

public class InvalidLoginTestCase extends BaseTest
{

	private static final String EXCEL_PATH = null;

	public static void main(String[] args) {

		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		
		int rc=flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
	}

}
