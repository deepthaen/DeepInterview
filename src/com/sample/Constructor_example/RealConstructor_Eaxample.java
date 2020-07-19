package com.sample.Constructor_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RealConstructor_Eaxample {
	
	WebDriver driver;
	public RealConstructor_Eaxample(WebDriver driver) {
		
	}
	
	public void launchUrl() {
		driver.get("http://www.google.com");
	}
	
}
