package com.banking.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.banking.pageObjects.LoginPage;
import com.banking.utilities.Base;
import com.banking.utilities.Provider;

public class TC_LoginTest_001 extends Base {

	@Test(dataProvider = "getData", dataProviderClass = Provider.class)
	public void loginTest(String user, String password, String expectation) {

		logger.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		SoftAssert asrt = new SoftAssert();

		if (expectation.equals("valid")) {
			lp.setUserName(user);
			logger.info("Entered username: " + user);
			lp.setPassword(password);
			logger.info("Entered password: " + password);

			lp.clickBtnLogin();
			logger.info("Login button clicked");

			asrt.assertEquals(lp.getTitle(), "Guru99 Bank Manager HomePage", "title no concidence");

			logger.info("Clicking Log out button");
			lp.clickLogOutBtn();

			logger.info("Verifying alert");
			asrt.assertTrue(lp.verifyAlert(), "Alert no present");

			logger.info("Accepting Alert");
			lp.acceptingAlert();

			asrt.assertAll();
		} else {

			lp.setUserName(user);
			logger.info("Entered username: " + user);
			lp.setPassword(password);
			logger.info("Entered password: " + password);

			lp.clickBtnLogin();
			logger.info("Login button clicked");

			logger.info("Verifying alert");
			asrt.assertTrue(lp.verifyAlert(), "Alert no present");

			logger.info("Accepting Alert");
			lp.acceptingAlert();
		}
	}

}
