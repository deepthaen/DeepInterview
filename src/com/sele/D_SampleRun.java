package com.sele;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_SampleRun {
	WebDriver driver; // declaring null driver
	WebWrappers methods; // crreating nbew Wrapper interface insttance in constructoir
	
	public D_SampleRun() {//construcyor
		methods = new WebImplementation();
	}
	
	
	@BeforeMethod
	public void bm() {
		driver = methods.launchBrowser();
	}
	
	
	@Test
	public void test() {
		methods.getUrl("http://www.nnnow.com");
	}
	
	
	@AfterMethod
	public void af() {
		methods.closeBrowser();
	}

}
