package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends A_LaunchBrowser {
	
	
	public Loginpage(WebDriver driver) {
		driver = super.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="jhgyh")
	public WebElement userrname;
	
	
	public void clickonUserName() {
		userrname.sendKeys("");
	}

}
