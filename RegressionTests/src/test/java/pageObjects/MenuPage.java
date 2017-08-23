package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.generic.Select;

public class MenuPage {

	public static WebElement element;

	public static WebElement MenuDropdownButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("/html/body/app-root/div/div[1]/app-menu/md-toolbar/div/md-toolbar-row/button[1]"));
		return element;
	}

	public static WebElement MenuDropdownHomePage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[1]/div"));
		return element;
	}

	public static WebElement MenuDropdownContactPage (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[2]/div"));
		return element;
	}

	public static WebElement MenuDropdownSalesPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[3]/div"));
		return element;
	}

	public static WebElement MenuDropdownPurchasePage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[4]/div"));
		return element;
	}

}
