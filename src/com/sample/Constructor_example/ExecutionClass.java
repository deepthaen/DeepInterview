package com.sample.Constructor_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {

	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		RealConstructor_Eaxample r = new RealConstructor_Eaxample(driver);
		r.launchUrl();
	}
}
