package com.banking.utilities.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.banking.interfaces.Web;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox extends Web {
	

	@Override
	public WebDriver initBrowser() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
