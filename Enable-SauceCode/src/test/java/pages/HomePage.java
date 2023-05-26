package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	WebElement AddToCart;
	
	@FindBy (className = "shopping_cart_link")
	WebElement ShoppingCart;
	
	
	public void AddToCart() 
	{
		
		AddToCart.click();
		ShoppingCart.click();
		
	}
}
