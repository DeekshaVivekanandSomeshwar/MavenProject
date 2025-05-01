package amazon.MavenProjectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void launch(String nameOfBrowser) throws InterruptedException {
		if (nameOfBrowser.contains("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameOfBrowser.contains("edge")) {
			driver = new EdgeDriver();
		}
		if (nameOfBrowser.contains("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
