package com.Selenium_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement send = driver.findElement(By.xpath("//textarea[@type='search']")) ;
		send.sendKeys("imdb movies");
		Thread.sleep(4000);
		
		WebElement shop = driver.findElement(By.xpath("//div[@class='lnnVSe']"));
		shop.click();
		
		Thread.sleep(4000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Screenshot\\imag.png");
		
		FileUtils.copyFile(src, des);
		}
}
