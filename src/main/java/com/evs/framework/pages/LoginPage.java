package com.evs.framework.pages;

import org.openqa.selenium.By;

import com.evs.framework.pages.homepage.Homepage;
import com.evs.framework.utility.WaitUtil;
import com.evs.framework.utility.WebUtil;

public class LoginPage extends WebUtil {

	
	public By USERNAME_INPUT	=By.xpath("//input[@id='email']");
	
	public By PASSWORD_INPUT	=By.xpath("//input[@id='pass']");
	
	public By LOGIN_BUTTON=By.xpath("//label[@id='loginbutton']");
	
	
	public Homepage validlogin() {
		
		tu
		WaitUtil.waitUntillElementPresent(driver.findElement(USERNAME_INPUT));
		
		filltextbox(driver.findElement(USERNAME_INPUT), "ankityadav.jnp@gmail.com");
		filltextbox(driver.findElement(PASSWORD_INPUT), "ankisrk@8373");
	    superClick(driver.findElement(LOGIN_BUTTON));
	    
	    return new Homepage();
	}
	
	
}
