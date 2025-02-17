package com.practise.qa.seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println("===========================");
		System.out.println(driver.getPageSource());
		
		
		//driver.navigate().to("https://www.selenium.dev/");		
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		//driver.navigate().forward();
		//System.out.println(driver.getTitle());
		//driver.navigate().refresh();
	}
}
