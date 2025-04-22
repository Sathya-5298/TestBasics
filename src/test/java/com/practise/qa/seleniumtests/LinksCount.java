package com.practise.qa.seleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) 
	{
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.actitime.com/");
		 * 
		 * List<WebElement> links = driver.findElements(By.xpath("//a"));
		 * 
		 * System.out.println(links.size());
		 * 
		 * for(WebElement s : links) { System.out.println(s.getText());
		 * System.out.println(s.getDomAttribute("class"));
		 * System.out.println("============="); } driver.close();
		 */
		
		System.out.println(5<<2);
		
		int x = 5;
		int y = 10;
		
		first:{
			second:
			{
				third:
				{
					if(x==y >> 1) 
					{
						break second;
					}
				}
				System.out.println(x);
			}
			System.out.println(y);
		}
		
		
	}

}
