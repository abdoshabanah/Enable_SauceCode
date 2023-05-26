package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

public class TestBase {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void StartDriver(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			//driver = new FirefoxDriver();
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
			options.addArguments("-headless");


			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			//driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
		}

	}
	@AfterTest
	public void CloseDriver()
	{
		driver.quit();

	}
}
