package amazon.MavenProjectAmazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class LoginSuccess_TestCase2 extends BaseClass {

	@Test
	public void validcredential() throws InterruptedException, EncryptedDocumentException, IOException {

		HomePage home = new HomePage(driver);
		home.accountList(driver);
		home.signInHome();
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.un();
		login.clickContinuebutton();
		login.pwd();
		login.signInButtonLogin();

	}

}
