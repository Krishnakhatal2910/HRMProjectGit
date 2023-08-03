package com.orangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName=By.xpath("//div[@class='oxd-form-row']/div/div[2]/input[@placeholder='Username']");
	By password=By.xpath("//div[@class='oxd-form-row']/div/div[2]/input[@placeholder='Password']");
	By login=By.xpath("//button[normalize-space()='Login']");
	
	By logo=By.xpath("//img[@alt='company-branding']");
	
	public HomePage validateCred() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userName).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(password).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(login).click();
		Thread.sleep(2000);
		return new HomePage();
		
	}
	
	public boolean verifyLogo() throws InterruptedException {
		boolean status=false;
		Thread.sleep(2000);
		status=driver.findElement(logo).isDisplayed();
		Thread.sleep(2000);
		return status;
		
	}
	
	
}
