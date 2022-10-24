package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(css = "input[name = 'uid']")
	WebElement userName;
	
	@FindBy(css = "input[name = 'password']")
	WebElement password;
	
	@FindBy(css = "input[name = 'btnLogin']")
	WebElement btnLogin;
	
	@FindBy(css = "title")
	WebElement title;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
