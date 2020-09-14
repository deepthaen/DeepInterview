package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_allMethods {

	/**
	 * launch browser
	 * Get url
	 * navogate url
	 * Maximise
	 * Launch different browser -- if possible
	 * Find element
	 * elements
	 * wait
	 * switch browser
	 * actions
	 * select
	 * 
	 */
	
	public static WebDriver driver =null;
	
	public  C_allMethods () {
		this.driver = getInstance();
	}
	
	public static WebDriver getInstance() {
	if (driver == null)
	{
		System.setProperty("chrome.driver.path", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	return driver;
	}
	
	public void maximise() {
		driver.manage().window().maximize();	
		
	}
	
	public void getUrl() {
		driver.get("http://myntra.com");
	}
	
    
	
}
	
	
	/**
	 * //div[@class='desktop-logoContainer']
	 * //*[text()='Profile']
	 * //*[contains(text(),'Home & Li')]
	 * //*[@href='/shop/home-living']
	 */






