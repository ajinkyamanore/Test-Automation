package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Login_Page;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse-workspace\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://15.207.130.89:8083/user/login?destination=/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Login_Page.txt_username(driver).sendKeys("197572");

		Login_Page.txt_password(driver).sendKeys("197572");

		Login_Page.btn_submit(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Refer_friend = driver.findElement(By.xpath("//*[@id=\"block-dvue-main-navigation\"]/ul/li[2]/a"));
		Refer_friend.click();
		Thread.sleep(2000);

		WebElement txt_Search = driver.findElement(By.id("quick-search"));
		txt_Search.sendKeys("Entry");
		
//		 WebElement location_filter = driver.findElement(By.xpath("//*[@id=\"quick-location\"]")); 
//		 Select oSelect = new Select(location_filter); 
//		 oSelect.selectByVisibleText("Mumbai");
//		 
//		 WebElement campaign_filter =driver.findElement(By.xpath("//*[@id=\"quick-campaign\"]")); 
//		 Select mSelect = new Select(campaign_filter); 
//		 mSelect.selectByVisibleText("EIT Campaign");
		 
		WebElement btn_Search = driver.findElement(By.xpath("//*[@id=\"block-banners\"]/div/div/div/section[2]/div/form/div/div[5]/button"));
		btn_Search.click();
		Thread.sleep(2000);

		WebElement Apply = driver.findElement(By.xpath("//*[@id=\"block-dvue-content\"]/article/div/div/div/div/div/section/div[1]/div/ul/li/div[2]/div[2]/a"));
		Apply.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Refer_btn = driver.findElement(By.xpath("//*[@id=\"block-dvue-content\"]/div/div/div/div/div[1]/div[2]/div[1]/a"));
		Refer_btn.click();

		WebElement Salutation = driver.findElement(By.xpath("//*[@id=\"edit-salutation\"]"));
		Select sSelect = new Select(Salutation);
		sSelect.selectByVisibleText("Mr.");

		WebElement txt_firstname = driver.findElement(By.id("edit-first-name"));
		txt_firstname.sendKeys("Amit");

		WebElement txt_middlename = driver.findElement(By.id("edit-middle-name"));
		txt_middlename.sendKeys("M");

		WebElement txt_lastname = driver.findElement(By.id("edit-last-name"));
		txt_lastname.sendKeys("Shah");

		WebElement Gender = driver.findElement(By.id("edit-gender-id"));
		Select gSelect = new Select(Gender);
		gSelect.selectByVisibleText("Male");

		WebElement txt_DOB = driver.findElement(By.id("edit-dob"));
		txt_DOB.sendKeys("01011990");

		WebElement txt_Emailid = driver.findElement(By.id("edit-email-id"));
		txt_Emailid.sendKeys("amit.shah@yahoo.com");

		WebElement txt_mobileNo = driver.findElement(By.id("edit-mobile-no"));
		txt_mobileNo.sendKeys("9930345678");

		WebElement txt_aadharNo = driver.findElement(By.id("edit-aadhar-no"));
		txt_aadharNo.sendKeys("1234987634567789");

//		WebElement btn_Save = driver.findElement(By.xpath("//*[@id=\"block-dvue-content\"]/div/div/div/form/div[4]/button[2]"));
//		btn_Save.click();
//		Thread.sleep(2000);

		WebElement head_address = driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a"));
		head_address.click();

		WebElement address_type = driver.findElement(By.id("edit-address-type-id"));
		Select aSelect = new Select(address_type);
		aSelect.selectByVisibleText("Permanent");

		WebElement txt_adressline1 = driver.findElement(By.id("edit-addressline1"));
		txt_adressline1.sendKeys("123 Trump Tower, wall street");

		WebElement txt_adressline2 = driver.findElement(By.id("edit-addressline2"));
		txt_adressline2.sendKeys("Vashi");

		WebElement city = driver.findElement(By.id("edit-city"));
		Select cSelect = new Select(city);
		cSelect.selectByVisibleText("Navi Mumbai");

		WebElement state = driver.findElement(By.id("edit-state-id"));
		Select kSelect = new Select(state);
		kSelect.selectByVisibleText("Maharashtra");

		WebElement country = driver.findElement(By.id("edit-state-id"));
		Select dSelect = new Select(country);
		dSelect.selectByVisibleText("INDIA");
		
		WebElement head_education = driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[3]/a"));
		head_education.click();
		
		
		
		

		// driver.quit();

	}

}
