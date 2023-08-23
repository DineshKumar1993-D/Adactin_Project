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

public class Imdp_Program {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ser=driver.findElement(By.xpath("//input[@placeholder='Search IMDb']"));
		ser.sendKeys("ponniyin selvan");
		
		Thread.sleep(3000);
			
		WebElement serc=driver.findElement(By.xpath("//button[@type='submit']"));
		serc.click();
		
		WebElement butt=driver.findElement(By.xpath("//a[@class='ipc-metadata-list-summary-item__t']"));
		butt.click();
		
		WebElement pri=driver.findElement(By.xpath("//span[@class='sc-bde20123-1 iZlgcd']"));
		String text=pri.getText();
		System.out.println("The Rating is:"+ text);
		
		TakesScreenshot ts=(TakesScreenshot) driver; //driver is a object
	
		File src = ts.getScreenshotAs(OutputType.FILE);//File is a class

		File des = new File("C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Screenshot\\image.png");
	
		FileUtils.copyFile(src, des);
			
			
			
			
			
			
			
			
		}
}
