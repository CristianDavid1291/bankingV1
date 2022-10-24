package com.banking.interfaces;

import org.openqa.selenium.WebDriver;

public abstract class Web implements browser,client{

	@Override
	public void initClient() {
		initBrowser();
		
	}

	@Override
	public abstract WebDriver initBrowser();
	
}
