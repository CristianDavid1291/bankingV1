package com.banking.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.banking.pageObjects.LoginPage;
import com.banking.utilities.Base;

public class TC_LoginTest_001 extends Base {
	
	@Test
	public void loginTest() {
		
		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		System.out.println(user);
		logger.info("Entered username");
		lp.setPassword(password);
		System.out.println(password);
		logger.info("Entered password");
		
		lp.clickBtnLogin();
		logger.info("Login button clicked");
		
		SoftAssert asrt= new SoftAssert();
		
		asrt.assertEquals(lp.getTitle(),"Guru99 Bank Manager HomePage","title no concidence");
			
		
		asrt.assertAll();
	}

}
