package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "user-name")
	WebElement username;
	
	@FindBy (id = "password")
	WebElement password;
	
	@FindBy (id = "login-button")
	WebElement LoginBTN;
	
	public void Login()
	{
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		LoginBTN.click();
		
	}
}

