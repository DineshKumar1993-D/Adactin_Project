package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Program {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement but=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		but.click();							//simple alert
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		WebElement butt=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		butt.click();							//confirm alert
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss(); 
		
		Thread.sleep(3000);
		
		WebElement prompt=driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		prompt.click();							//prompt alert
		driver.switchTo().alert().sendKeys("java");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3500);
		
		WebElement buts=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		Thread.sleep(7000);
		buts.click();									//after 5 seconds confirm button
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
	
	}
	
	

}
