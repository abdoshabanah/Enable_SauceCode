package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FinishConfirmationPage extends PageBase{
    public FinishConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    WebElement FinishBTN;


    public void CheckConfirmCheckout() {

        Assert.assertEquals(FinishBTN.getText(),"Finish");
        FinishBTN.click();


    }
}
