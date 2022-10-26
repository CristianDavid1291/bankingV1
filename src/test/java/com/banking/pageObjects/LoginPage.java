package com.banking.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(linkText = "Log out")
	WebElement logOutBtn;

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

	public void clickLogOutBtn() {
		logOutBtn.click();
	}

	public void acceptingAlert() {

		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}

	public boolean verifyAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean f = wait.until(ExpectedConditions.alertIsPresent()) != null ? true : false;
		return f;

	}
}
