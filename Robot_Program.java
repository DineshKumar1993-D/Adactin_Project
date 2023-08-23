package com.Selenium_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Program {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
		
		WebDriver dp = new ChromeDriver();
		
		dp.get("https://www.amazon.in/");
		dp.manage().window().maximize();
		
		Actions s = new Actions(dp);
		
		WebElement act=dp.findElement(By.xpath("(//a[@data-csa-c-type='link'])[6]"));
		s.contextClick(act).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3500);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
