package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonNNNow {
	
	public static WebDriver driver;
	
	public CommonNNNow() {
		this.driver =getInstance();
	}
	
		
	public static WebDriver getInstance() {
		if(driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
			 driver = new ChromeDriver(options);	
		}else {
			//do nothing
		}
		return driver;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void getUrl() {
		driver.get("https://nnnow.com");
	}
	
	public void waitel() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
	}
	}
	
	
	
	

