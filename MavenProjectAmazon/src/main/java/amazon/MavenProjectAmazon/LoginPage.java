package amazon.MavenProjectAmazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// step 1
	@FindBy(name = "email")
	WebElement username;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement continueButton;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signInButton;

	// Step 2

	public void un() throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Deeksha\\eclipse-workspace\\MavenProjectAmazon\\Excel\\Credential.xlsxx");
		Workbook w1 = WorkbookFactory.create(f1);
		String user = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		username.sendKeys(user);
	}

	public void clickContinuebutton() throws EncryptedDocumentException, IOException {
		continueButton.click();
	}

	public void pwd() throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Deeksha\\eclipse-workspace\\MavenProjectAmazon\\Excel\\Credential.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String pass = w1.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		password.sendKeys(pass);
	}

	public void signInButtonLogin() throws EncryptedDocumentException, IOException {
		signInButton.click();
	}

	// Step 3
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
