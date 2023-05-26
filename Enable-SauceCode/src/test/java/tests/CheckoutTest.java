package tests;

import org.testng.annotations.Test;

import pages.*;

public class CheckoutTest extends TestBase{


	LoginPage LoginObject;
	HomePage HomeObject;
	CheckoutPage CheckoutObject;

	CheckoutConfirmationPage CheckoutConfObject;

	FinishConfirmationPage FinishObject;

	ThanksPage ThankObject;


	@Test
	public void Checkout() throws InterruptedException {
		
		LoginObject = new LoginPage(driver);
		LoginObject.Login();
		Thread.sleep(500);
		
		HomeObject = new HomePage(driver);
		HomeObject.AddToCart();
		Thread.sleep(500);
		
		CheckoutObject = new CheckoutPage(driver);
		CheckoutObject.Checkout();

		CheckoutConfObject = new CheckoutConfirmationPage(driver);
		CheckoutConfObject.ConfirmCheckout();

		FinishObject = new FinishConfirmationPage(driver);
		FinishObject.CheckConfirmCheckout();

		ThankObject = new ThanksPage(driver);
		ThankObject.CheckMessage();
		
	}
}
