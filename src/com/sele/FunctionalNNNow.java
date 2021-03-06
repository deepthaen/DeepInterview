package com.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FunctionalNNNow{

	WebDriver driver;
	
	public  FunctionalNNNow(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		driver.findElement(By.xpath("//span[@class='nw-loginbutton-text']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email / Phone Number']")).sendKeys("deepthaen@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nnnow123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void hoverCategory() {
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//span[contains(text(),'WOMEN')]"));
		action.moveToElement(hover).build().perform();
	}

	public void  subCategory() {
		driver.findElement(By.xpath("//*[text()='Tops & T-Shirts']")).click();
	}

	public void listpage() {
		String currentWindow = driver.getWindowHandle();
		Actions baction = new Actions(driver);
		baction.moveToElement(driver.findElement(By.xpath("//div[@class='nw-productview-producttitle']")))
		.click(driver.findElement(By.xpath("//div[@class='nw-productview-producttitle']"))).build().perform();
		

		Set<String> windows =driver.getWindowHandles();

		// windows().iterator().next();
		for (String s : windows) {
			if(!s.equals(currentWindow))
			{
				driver.switchTo().window(s);
			}
		}

	}
	
	public void pdp() {
		driver.findElement(By.xpath("//button[contains(text(),'XXS')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'nw-color-block')]//a[1]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag')]")).click();
	}
	
	public void continuePDP() {
		driver.findElement(By.xpath("//*[text()='CHECKOUT']")).click();
	}
	
	public void navgCheckout() {
		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
	}
}
