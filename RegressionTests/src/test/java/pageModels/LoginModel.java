package pageModels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import testData.ExcelUtils;
import pageObjects.LoginPage;

public class LoginModel {

	public static void AdminLogin(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LoginPage.UserName(driver).sendKeys(sUserName);

		LoginPage.Pasword(driver).sendKeys(sPassword);

		LoginPage.LogInButton(driver).click();

	}
	
	public static void IncorrectUserLogin(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(2, 1);

		String sPassword = ExcelUtils.getCellData(2, 2);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LoginPage.UserName(driver).sendKeys(sUserName);

		LoginPage.Pasword(driver).sendKeys(sPassword);

		LoginPage.LogInButton(driver).click();

	}
	
	public static void IncorrectPassLogin(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(3, 1);

		String sPassword = ExcelUtils.getCellData(3, 2);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LoginPage.UserName(driver).sendKeys(sUserName);

		LoginPage.Pasword(driver).sendKeys(sPassword);

		LoginPage.LogInButton(driver).click();

	}

}
