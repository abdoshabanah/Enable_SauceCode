package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutConfirmationPage extends PageBase{
    public CheckoutConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    WebElement FirstName;

    @FindBy(id = "last-name")
    WebElement LastName;

    @FindBy(id = "postal-code")
    WebElement PostalCode;

    @FindBy(id = "continue")
    WebElement ContinueBTN;



    public void ConfirmCheckout()
    {

        FirstName.sendKeys("Test");
        LastName.sendKeys("Test");
        PostalCode.sendKeys("Test");
        ContinueBTN.click();
    }
}
