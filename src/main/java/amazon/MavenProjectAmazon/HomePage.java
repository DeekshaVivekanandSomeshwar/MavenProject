package amazon.MavenProjectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountAndList;

	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signInButton;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchTextField;

	// 2
	public void accountList(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndList).perform();
	}

	public void signInHome() {
		signInButton.click();
	}

	public void searchEnterAndClick(String text) {
		searchTextField.sendKeys(text);
		searchTextField.sendKeys(Keys.ENTER);
	}

	// Step 3
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
