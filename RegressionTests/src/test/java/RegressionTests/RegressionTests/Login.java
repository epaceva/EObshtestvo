package RegressionTests.RegressionTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testData.Constant;
import junit.framework.Assert;
import pageModels.LoginModel;
import pageObjects.HomePage;

import testData.ExcelUtils;

public class Login {

	private static WebDriver driver;
	private WebDriverWait wait;

	@Before

	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SeleniumDriver\\chromedriver.exe");
		/*
		 * System.setProperty("webdriver.chrome.logfile",
		 * "D:\\Documents\\SeleniumDriver\\chromedriver.log");
		 * System.setProperty("webdriver.chrome.verboseLogging", "true");
		 */

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

	}

	@SuppressWarnings("deprecation")
	@Test
	public void SuccessfulLogin() throws Exception {

		LoginModel.Execute(driver);

		Assert.assertEquals("settings_powerLogout", HomePage.AdminAccount_LogOut(driver).getText());

		ExcelUtils.setCellData("Pass", 1, 3);

		HomePage.AdminAccount_LogOut(driver).click();

	}

	@After

	public void tearDown() {
		this.driver.quit();

	}

}
