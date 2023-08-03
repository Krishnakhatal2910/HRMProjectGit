package com.orangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	By menu=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	By logoutBtn=By.xpath("//a[normalize-space()='Logout']");
	
	
	public void click() throws InterruptedException {
		driver.findElement(menu).click();
		Thread.sleep(5000);
		driver.findElement(logoutBtn).click();
	}
}
