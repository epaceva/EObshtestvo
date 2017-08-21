package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement UserName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"md-input-1\"]"));
		return element;
	}

	public static WebElement Pasword(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"md-input-3\"]"));
		return element;
	}

}
