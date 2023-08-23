package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);//---> By using Index
		
//		WebElement frame = driver.findElement(By.id("singleframe"));
//		driver.switchTo().frame(frame);//--> By using id
		
//		WebElement xpath = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
//		driver.switchTo().frame(xpath);  //-->By using Xpath
		
		WebElement send = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		send.sendKeys("Java");
		
		driver.switchTo().defaultContent();
		
		WebElement multi = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multi.click();
		
		driver.switchTo().frame(1);
		
		WebElement find = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(find);
		
		WebElement frame1 = driver.findElement(By.xpath("//input[@type='text']"));
		frame1.sendKeys("Welcome to selenium");
		
	}

}
