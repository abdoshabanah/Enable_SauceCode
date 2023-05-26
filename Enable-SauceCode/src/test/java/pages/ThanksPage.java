package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ThanksPage extends PageBase{
    public ThanksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement Thankyou;


    public void CheckMessage() {

        Assert.assertEquals(Thankyou.getText(),"Thank you for your order!");
    }
}