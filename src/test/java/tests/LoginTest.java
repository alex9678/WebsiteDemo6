package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Override
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Test(description = "login failed test")
	public void tc01_loginfailed() {
		loginPage.login("Standart user", "1231321");
		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(actual, expected);

	}

	@Test(description = "login Passed")
	public void tc02_loginpassed() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Test(description = "logout test")
	public void tc03_logout() {
		productsPage.logout();
	}

}
