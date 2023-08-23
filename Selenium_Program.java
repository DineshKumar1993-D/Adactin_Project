package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe" );
		
			System.out.println("**************");
		
		WebDriver Driver = new ChromeDriver();	//upcasting
			System.out.println("WebDriver Methods");
		Driver.get("https://www.google.com/");
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		Thread.sleep(3500);
		String title=Driver.getTitle();
			System.out.println("Title of the page is:" +title);
		String sb=Driver.getCurrentUrl();
			System.out.println("The current url is:" +sb);
			
			System.out.println("**************");
		
			System.out.println("Navigation");
			
		Driver.navigate().to("https://www.instagram.com/accounts/login/");
			System.out.println("Navigate to:"+ Driver);
		Thread.sleep(5000);	
		Driver.navigate().back();
			System.out.println("Navigate back:"+ Driver);
		Thread.sleep(3000);
		Driver.navigate().refresh();
			System.out.println("Navigate refresh:"+ Driver);
		Thread.sleep(3500);
		Driver.close();
			System.out.println("Current window close:"+ Driver);
		Thread.sleep(4000);
		Driver.quit();
				System.out.println("Entire browse session:"+ Driver);
		
		
		
	}

}
	//	System--->class
	// 	Setproperty--->method
	
	// 	key-->WebDriver.Chrome.Driver
	//	value--->path location

	//	WebDriver--->Interface
	// 	ChromeDriver--->class