package com.sele;

import org.openqa.selenium.WebDriver;

public interface WebWrappers {
	
	
	WebDriver launchBrowser();
	void getUrl(String url);
	void closeBrowser();
	void quitBroswer();
	void maximiseBroser() ;
	void typeText(String text);
	void clearText();
	void implicitWait(long time);
	void waitForEleemnt(long time);
	void waitfroClickable(long time);
	void sleepfor(long time);
	

}
