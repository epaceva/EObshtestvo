package pageModels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import testData.ExcelUtils;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginModel {

	public static void Execute(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LoginPage.UserName(driver).sendKeys(sUserName);

		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LoginPage.Pasword(driver).sendKeys(sPassword);

		HomePage.AdminAccount_LogIn(driver).click();

	}

}
