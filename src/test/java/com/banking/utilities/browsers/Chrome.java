package com.banking.utilities.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.interfaces.Web;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome extends Web {

	@Override
	public WebDriver initBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}



}
