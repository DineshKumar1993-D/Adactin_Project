package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement ent=driver.findElement(By.xpath("//input[@type='text']"));
	ent.sendKeys("dinesh@gmail.com");
	
	WebElement pas=driver.findElement(By.xpath("//input[@type='password']"));
	pas.sendKeys("dineshkumar");
	
	Thread.sleep(4000);
	
	WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
	log.click();
	
	
	
	
	
	
	
	
	}
	
}
