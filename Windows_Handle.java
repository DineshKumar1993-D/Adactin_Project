package com.Selenium_Project;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Windows_Handle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement send = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		send.sendKeys("nykaa online shopping");
		Thread.sleep(1000);
		WebElement cli = driver.findElement(By.xpath("(//div[@class='lnnVSe'])[1]"));
		cli.click();
		Thread.sleep(1000);

		Actions s = new Actions(driver);

		WebElement rig = driver.findElement(By.xpath("(//span[@data-dtld='nykaa.com'])[1]"));
		s.contextClick(rig).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);

		Set<String> window = driver.getWindowHandles();

		for (String str : window) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);

		}
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		Actions a = new Actions(driver);

		WebElement make = driver.findElement(By.xpath("(//a[@target='_blank'])[133]"));
		a.contextClick(make).perform();
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> window1 = driver.getWindowHandles();
		
		for (String stri : window1) {
			String title1 = driver.switchTo().window(stri).getTitle();
			System.out.println(title1);
		}
		
		driver.navigate().refresh();
		
		WebElement comp = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
		comp.sendKeys("Compact");
		Thread.sleep(1000);
		Robot r2 = new Robot();
		
		WebElement compa = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement pow = driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[2]"));
		pow.click();
		
		Set<String> window2 = driver.getWindowHandles();
		
		for (String strin : window2) {
			String title2 = driver.switchTo().window(strin).getTitle();
			System.out.println(title2);
			
		}
		WebElement adto = driver.findElement(By.xpath("(//span[@class='btn-text'])[1]"));
		adto.click();
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		cart.click();
		Thread.sleep(2000);
	
		WebElement proc = driver.findElement(By.xpath("(//span[@class='css-1aowomc ehes2bo0'])[6]"));
		proc.click();
		
		
		
	}

}
