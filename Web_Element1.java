package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //upcasting methods
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		
		WebElement ser=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ser.sendKeys("imdp movies");
		Thread.sleep(2000);
		WebElement serc=driver.findElement(By.xpath("//div[@class='sbic sb43']"));
		serc.click();
		WebElement cli=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		cli.click();
		Thread.sleep(2500);
		WebElement clic=driver.findElement(By.xpath("//input[@type='text']"));
		clic.sendKeys("ponniyin selvan");
		Thread.sleep(2500);
		WebElement but=driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
		but.click();
		Thread.sleep(3000);
		WebElement butt=driver.findElement(By.xpath("//a[@class='ipc-metadata-list-summary-item__t']"));
		butt.click();
		Thread.sleep(3500);
		WebElement rat=driver.findElement(By.xpath("//span[@class='sc-bde20123-1 iZlgcd']"));
		String text=rat.getText();
		System.out.println("The Rating is:"+ text);
	}
}
