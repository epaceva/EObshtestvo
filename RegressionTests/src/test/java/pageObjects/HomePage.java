package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	
	public static WebElement AdminAccount_LogIn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/ng-component/div/button/span"));
		return element;
	}

	public static WebElement AdminAccount_LogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-menu/md-toolbar/div/md-toolbar-row/button[3]/span"));
		return element;
	}
}
