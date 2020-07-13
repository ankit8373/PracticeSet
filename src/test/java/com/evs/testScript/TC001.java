package com.evs.testScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.evs.framework.pages.LoginPage;
import com.evs.framework.utility.WebUtil;

public class TC001 {
	@BeforeMethod
	@Parameters({"browserName","url"})
	public void open(String browserName,String url) {
		
		WebUtil.openBrowser(browserName);
		WebUtil.openUrl(url);

	}

	@AfterMethod
	public void close() {
		WebUtil.driver.close();
	}

	@Test
	public void validateallfrndlist() {

		new LoginPage().validlogin()

				.clickOnMyProfile();

	}
}
