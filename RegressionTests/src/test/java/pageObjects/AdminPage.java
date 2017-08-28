package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	public static WebElement element;
	
	public static WebElement AdminDropdownButton (WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-menu/md-toolbar/div/md-toolbar-row/button[2]/span"));
		return element;
	}
	
	public static WebElement AdminDropdownUserManagementPage(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button/div"));
		return element;
	}

}
