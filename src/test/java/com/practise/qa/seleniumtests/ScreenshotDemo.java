package com.practise.qa.seleniumtests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\sdevalap\\OneDrive - Capgemini\\Selenium Java\\Selenium_Test\\target\\test.png"));
		
		driver.quit();
	}
}
