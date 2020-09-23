package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	private static WebElement element = null;
	public static WebElement txt_username(WebDriver driver) {
		element = driver.findElement(By.id("edit-name"));
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver) {
		element = driver.findElement(By.id("edit-pass"));
		return element;
	}
	
	public static WebElement btn_submit(WebDriver driver) {
		element = driver.findElement(By.id("edit-submit"));
		return element;
	}
}
