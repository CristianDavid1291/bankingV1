package com.banking.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.utilities.browsers.Chrome;
import com.banking.utilities.browsers.Explorer;
import com.banking.utilities.browsers.Firefox;


public class Base {

	ReadConfig readConfig = new ReadConfig();

	protected String url = readConfig.getApplicationUrl();
	protected String user = readConfig.getUser();
	protected String password = readConfig.getPassword();
	protected WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		switch (browser) {
		
		case "chrome":
			Chrome chrome = new Chrome();
			driver = chrome.initBrowser();
			break;

		case "firefox":
			Firefox firefox = new Firefox();
			driver = firefox.initBrowser();
		case "explorer":
			Explorer explorer = new Explorer();
			driver = explorer.initBrowser();
		default:
			break;
		}
		
		driver.get(url);

		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
