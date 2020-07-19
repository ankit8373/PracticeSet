package com.evs.framework.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	private static WebDriver driver = WebUtil.driver;
	

	
	public static WebElement waitUntillElementPresent(WebElement element) {
			
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}
