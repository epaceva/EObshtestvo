package RegressionTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.Constant;
import junit.framework.Assert;
import pageModels.LoginModel;
import pageObjects.LoginPage;
import testData.ExcelUtils;

public class LoginTest {

	private static WebDriver driver;

	@Before

	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SeleniumDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.logfile", "D:\\Documents\\SeleniumDriver\\chromedriver.log");
		System.setProperty("webdriver.chrome.verboseLogging", "true");

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void SuccessfulLogin() throws Exception {

		LoginModel.AdminLogin(driver);

		Assert.assertEquals("settings_powerLogout", LoginPage.LogOutButton(driver).getText());

		ExcelUtils.setCellData("Pass", 1, 3);

		LoginPage.LogOutButton(driver).click();

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void ErrorMessageLogin() throws Exception {

		LoginModel.IncorrectUserLogin(driver);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Assert.assertEquals("Wrong username or password.", LoginPage.ErrorMessage(driver).getAttribute("class"));

		ExcelUtils.setCellData("Pass", 2, 3);


	}

	@After

	public void tearDown() {
		this.driver.quit();

	}

}
