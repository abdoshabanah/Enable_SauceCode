package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "checkout")
	WebElement Checkout;
	
	
	public void Checkout() 
	{
		
		Checkout.click();
		
	}
}
