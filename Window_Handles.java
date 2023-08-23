package com.Selenium_Project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("(//a[@target='_blank'])[133]"));
		
		Actions a = new Actions(driver);
		a.clickAndHold(drag).perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.xpath("(//a[@target='_blank'])[138]"));
		
		Actions a1 = new Actions(driver);
		a1.click(drop).perform();
		
		Set<String> s = driver.getWindowHandles();
		
		for (String str : s) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
	
				
		WebElement pow = driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]"));
		pow.click();
		
		Set<String> s1 = driver.getWindowHandles();
		
		for (String stri : s1) {
			driver.switchTo().window(stri).getTitle();
			
		}
		WebElement add = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
		add.click();
		
		WebElement but = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		but.click();
		
		WebElement butt = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(butt);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement proc = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
		proc.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement gues = driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		gues.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement pin = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		pin.sendKeys("636102");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement hous = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		Actions house = new Actions(driver);
		house.click(hous).perform();
		house.sendKeys("      ", "     Salem").perform();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement name = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		name.sendKeys("Attur");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement nam = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		nam.sendKeys("Dineshkumar");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		mobile.sendKeys("9843099435");
		
		
		
		WebElement mail = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		mail.sendKeys("pdineshkumar03@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ship = driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
		ship.click();
		
		
	
	
	}

}
