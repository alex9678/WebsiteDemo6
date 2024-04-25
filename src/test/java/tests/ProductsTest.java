package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
	
	@Test(description = "add product test")
	public void tc01_addproduct() {
		productsPage.addToCart("Sauce Labs Backpack");
		
	
	}
	
	@Test(description = "add remove products test")
	public void tc02_remove() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.remove("Sauce Labs Bike Light");
		
	}

}
