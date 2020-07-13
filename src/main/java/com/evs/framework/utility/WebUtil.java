package com.evs.framework.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public   class WebUtil {

	public static WebDriver driver;
	
	
	public static void filltextbox( WebElement element , String value) {
		
		scrollTo(element);
		element.sendKeys(value);
		
	}
	public static void openBrowser(String browserName) {
		
	if(browserName.equalsIgnoreCase("chrome")) {	
	System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
	
	driver=new ChromeDriver();
	
	}
	driver.manage().window().maximize();
	}
	
	public static void openUrl(String url) {
		
		driver.get(url);
		
	}
	public static Actions getAction(WebDriver driver) {
		
		return new Actions(driver);
	}
	
	public static JavascriptExecutor getJavaScriptExecutor() {
		
		JavascriptExecutor js=null;
		
		if(js==null) {
			 js=(JavascriptExecutor) driver;
		}
			
		return js;
		
	}
	
	public static void scrollTo(WebElement element) {
		
		getJavaScriptExecutor().executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void jsClick(WebElement element) {
		
	getJavaScriptExecutor().executeScript("arguments[0].click();", element);
		
	}
	
	public static void superClick(WebElement element) {
		
	try {
		
		scrollTo(element);
		element.click();
		
	}catch(Exception e) {
		
		scrollTo(element);
		jsClick(element);
	}
	
	}
	
	
	
}
