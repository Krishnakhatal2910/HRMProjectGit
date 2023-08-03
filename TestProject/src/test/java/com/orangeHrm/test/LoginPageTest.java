package com.orangeHrm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangeHrm.pages.HomePage;
import com.orangeHrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	public WebDriver driver;
	HomePage hp;
	LoginPage lp;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		Thread.sleep(2000);
		lp=new LoginPage(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@Test
	public void verifyLogo() throws InterruptedException {
		boolean isDisplayed = lp.verifyLogo();
		
		Assert.assertEquals(isDisplayed, true);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException {
		hp=lp.validateCred();
		
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
