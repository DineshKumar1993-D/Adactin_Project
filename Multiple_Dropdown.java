package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.xpath("//select[@name='cars']"));	
		System.out.println(s.getText());
			
		
		}

}
