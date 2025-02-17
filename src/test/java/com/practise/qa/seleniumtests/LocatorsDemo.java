package com.practise.qa.seleniumtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		driver.findElement(By.linkText("Try actiTIME for Free")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("FirstName")).sendKeys("Testdata");
		
		driver.quit();
	}

}
