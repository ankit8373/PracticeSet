package com.evs.framework.pages.myprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.evs.framework.utility.WaitUtil;
import com.evs.framework.utility.WebUtil;

public class MyProfile extends WebUtil{

	public By FRIENDS_LINK	= By.xpath("//a[text()='Friends']");
	
	public void clickOnFriendsLink() {
		
		WebElement friendsLink=WaitUtil.waitUntillElementPresent(driver.findElement(FRIENDS_LINK));
		superClick(friendsLink);
		
	}
	
	
}
