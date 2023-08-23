package com.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver\\chromedriver.exe");

		WebDriver dp = new ChromeDriver();

		dp.get("https://www.facebook.com/");
		dp.manage().window().maximize();
		Thread.sleep(4000);
		WebElement cre = dp.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		cre.click();
		Thread.sleep(4000);

		WebElement day = dp.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(9);
		Thread.sleep(3000);
		WebElement month = dp.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByValue("3");
		Thread.sleep(3500);
		WebElement year = dp.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1993");

		Thread.sleep(3000);
		WebElement sex = dp.findElement(By.xpath("//input[@value='2']"));
		sex.click();
		
		Thread.sleep(3000);
		
		WebElement year1 = dp.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year1);
		s3.deselectByVisibleText("1993");
		

	}

}
