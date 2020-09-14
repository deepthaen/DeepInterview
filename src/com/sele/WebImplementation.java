package com.sele;

import org.openqa.selenium.WebDriver;

public class WebImplementation implements WebWrappers {

	WebDriver driver;
	@Override
	public WebDriver launchBrowser() {
		A_LaunchBrowser launch = new A_LaunchBrowser();
		driver = launch.getInstance();
		return driver;
	}
	@Override
	public void getUrl(String url) {
		driver.get(url);
		
	}

	@Override
	public void closeBrowser() {
		driver.close();
		
	}

	@Override
	public void quitBroswer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximiseBroser() {
		driver.manage().window().maximize();
		
	}

	@Override
	public void typeText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void implicitWait(long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForEleemnt(long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitfroClickable(long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleepfor(long time) {
		// TODO Auto-generated method stub
		
	}

	

}
