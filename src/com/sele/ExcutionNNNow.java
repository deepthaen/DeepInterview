package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExcutionNNNow extends CommonNNNow {
	
	WebDriver driver;
	public ExcutionNNNow() {
		driver = getInstance();
	}
	
	@Test
	public void orderPlace() {
		maximize();
		getUrl();
		waitel();
		FunctionalNNNow fn = new FunctionalNNNow(driver);
		fn.login();
		fn.hoverCategory();
		fn.subCategory();
		fn.listpage();
		fn.pdp();
		fn.continuePDP();
		fn.navgCheckout();
			
	}
	

}
