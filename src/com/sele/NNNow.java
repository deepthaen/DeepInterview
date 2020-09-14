package com.sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NNNow {


	public static void main(String[] args) {


		WebDriver driver ;






		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");

		driver = new ChromeDriver(options);


		driver.manage().window().maximize();

		driver.get("https://nnnow.com");

		driver.findElement(By.xpath("//span[@class='nw-loginbutton-text']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email / Phone Number']")).sendKeys("deepthaen@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nnnow123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//span[contains(text(),'WOMEN')]"));
		action.moveToElement(hover).build().perform();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		driver.findElement(By.xpath("//*[text()='Tops & T-Shirts']")).click();
		
		
		String currentWindow = driver.getWindowHandle();
	Actions baction = new Actions(driver);
	baction.moveToElement(driver.findElement(By.xpath("//div[@class='nw-productview-producttitle']")))
	.click(driver.findElement(By.xpath("//div[@class='nw-productview-producttitle']"))).build().perform();
		//driver.findElement(By.xpath("//img[@text()='GAP Blue Modern Long Sleeve Boat Neck Tee']")).click();

		Set<String> windows =driver.getWindowHandles();

		// windows().iterator().next();
		for (String s : windows) {
			if(!s.equals(currentWindow))
			{
				driver.switchTo().window(s);
			}
			}





		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		driver.findElement(By.xpath("//button[contains(text(),'XXS')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'nw-color-block')]//a[1]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag')]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		driver.findElement(By.xpath("//*[text()='CHECKOUT']")).click();
		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();






		//span[contains(text(),'WOMEN')]
		//a[text()='Tops & T-Shirts']
		//img[@text()='GAP Blue Modern Long Sleeve Boat Neck Tee']
		//button[contains(text(),'XXS')]
		//div[contains(@class,'nw-color-block')]//a[1]
		//button[contains(@class,'nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag')]
		//button[contains(@class,'nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag')]
		//button[@class='nwc-btn nwc-btn nwc-btn-primary nwc-btn-sm nw-checkoutmybag-continue-button']





	}}


