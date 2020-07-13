package com.evs.framework.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.evs.framework.pages.myprofile.MyProfile;
import com.evs.framework.utility.WaitUtil;
import com.evs.framework.utility.WebUtil;

public class Homepage extends WebUtil {

	
	public By MYPROFILE_LINK= By.xpath("(//div[@class='buofh1pr']//ul)[1]//a");
	
	
	public MyProfile clickOnMyProfile() {
		
		WebElement profileButton=WaitUtil.waitUntillElementPresent(driver.findElement(MYPROFILE_LINK));
		
		superClick(profileButton);
		
		return new MyProfile();
	}
}
