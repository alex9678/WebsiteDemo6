package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends AppBasePage {

	@FindBy(css = ".inventory_item")
	private List<WebElement> areaList;

	public ProductsPage(WebDriver driver) {
		super(driver);

	}

	public void chooseProducts(String name) {
		for (WebElement area : areaList) {
			WebElement titleLink = area.findElement(By.cssSelector(".inventory_item_name"));
			if (titleLink.getText().equalsIgnoreCase(name)) {
				click(titleLink);

			}

		}
	}

	public void addToCart(String name) {
		for (WebElement area : areaList) {
			WebElement titleLink = area.findElement(By.cssSelector(".inventory_item_name"));
			if (titleLink.getText().equalsIgnoreCase(name)) {
				WebElement addBtn = area.findElement(By.cssSelector(".btn.btn_primary"));
				click(addBtn);

			}

		}
	}

	public void remove(String name) {
		for (WebElement area : areaList) {
			WebElement titleLink = area.findElement(By.cssSelector(".inventory_item_name"));
			if (titleLink.getText().equalsIgnoreCase(name)) {
				WebElement removeBtn = area.findElement(By.cssSelector(".btn.btn_secondary"));
				click(removeBtn);

			}

		}

	}

}
