package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
	//	a.clickAndHold(drag).moveToElement(drop).build().perform();
		
		//Direct method instead of clickAndHold method
		a.dragAndDrop(drag, drop).perform();
		
	}

}
