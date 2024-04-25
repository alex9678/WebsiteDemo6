package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(css = "#user-name")
	private WebElement userNameField;
	@FindBy(css = "#password")
	private WebElement passwordField;
	@FindBy(css = "#login-button")
	private WebElement loginBtn;
	@FindBy(css = ".error-message-container.error")
	private WebElement errorLabel;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public void login(String user, String password) {
		fillText(userNameField, user);
		fillText(passwordField, password);
		click(loginBtn);
	}

	public String getErrorMsg() {
		return getText(errorLabel);
	}

}
