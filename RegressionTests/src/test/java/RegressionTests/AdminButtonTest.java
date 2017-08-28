package RegressionTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import pageModels.LoginModel;
import pageObjects.AdminPage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import testData.Constant;
import testData.ExcelUtils;

public class AdminButtonTest {

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
	public void OpenUserManagementPage() throws Exception {

		LoginModel.AdminLogin(driver);

		AdminPage.AdminDropdownButton(driver).click();

		AdminPage.AdminDropdownUserManagementPage(driver).click();

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		String currentURL = driver.getCurrentUrl();

		Assert.assertEquals("http://139.59.204.64/admin/user", currentURL);

		ExcelUtils.setCellData("Pass", 8, 3);

		LoginPage.LogOutButton(driver).click();

	}
	
	@After

	public void tearDown() {
		this.driver.quit();

	}

}
