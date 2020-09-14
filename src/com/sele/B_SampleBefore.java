package com.sele;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B_SampleBefore {
	
	WebDriver driver ;
	A_LaunchBrowser launch;
	@BeforeMethod
	public void m() {
		 launch = new A_LaunchBrowser();
		 driver = launch.getInstance();
		
	}
	
	@Test
	public void test() {
		driver.get("http://www.google.com");
		Loginpage l= new Loginpage(driver);
		l.clickonUserName();
	}

}
