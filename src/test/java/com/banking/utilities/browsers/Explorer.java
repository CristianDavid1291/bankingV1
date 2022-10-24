package com.banking.utilities.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.banking.interfaces.Web;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explorer extends Web {

	@Override
	public WebDriver initBrowser() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		return driver;
	}

}
