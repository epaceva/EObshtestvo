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
	
	public static WebElement LogInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/ng-component/div/button/span"));
		return element;
	}

	public static WebElement LogOutButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-menu/md-toolbar/div/md-toolbar-row/button[3]/span"));
		return element;
	}
	
	public static String ErrorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/ng-component/div/div"));
		return element.getAttribute("class");
	}

}
