package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import pages.ProductsPage;
import utils.Utils;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductsPage productsPage;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = Utils.getValue("url");
		driver.get(url);
		loginPage = new LoginPage(driver);
		productsPage = new ProductsPage(driver);

	}

	@BeforeClass
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@AfterClass
	public void TearDown() {

	}

}
