package com.absoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class My_Account_Page {
	
	WebDriver driver;
	
	
	public My_Account_Page(WebDriver driver) {
		this.driver = driver;
		
		//super(driver);
	}
	
	public String pageTitle() {
		return pageTitle();
	}
	
	public My_Account_Page loginAs(String username, String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();	
		
		return new My_Account_Page(driver);
	}
	
	public boolean loginSuccessful(String username) {
				
		return driver.findElement(By.id("user_info")).getText().contains(username);
		}

}
