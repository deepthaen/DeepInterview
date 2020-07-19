package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_LaunchBrowser {
	
	public A_LaunchBrowser() {
		this.driver =getInstance();
	}
	
	
	public static WebDriver driver =null;
	
	public static WebDriver getInstance() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
			 driver = new ChromeDriver();	
		}else {
			//do nothing
		}
		return driver;
	}
	
	
	/**
	 * 
	 * Webdriver driver = null
	 * if(driver == null) {
	 * driver = new ChromeDriver();
	 * }
	 * return driver;
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	/**
	 * Webdriver -- it is interface
	 * Chrome -- class
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	}

}
