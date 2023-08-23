package com.Selenium_Project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver3\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement send = driver.findElement(By.xpath("//textarea[@type='search']"));
		send.sendKeys("adactin hotel");
		Thread.sleep(3000);
		WebElement cli = driver.findElement(By.xpath("(//div[@class='lnnVSe'])[1]"));
		cli.click();
		Thread.sleep(2500);
		WebElement clic = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		clic.click();
		Thread.sleep(3000);
		WebElement sen = driver.findElement(By.xpath("//input[@name='username']"));
		sen.sendKeys("Sathish1826");
		Thread.sleep(3000);
		WebElement se = driver.findElement(By.xpath("//input[@type='password']"));
		se.sendKeys("Sathish3456");
		Thread.sleep(1500);
		WebElement s = driver.findElement(By.xpath("//input[@name='login']"));
		s.click();
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(location);
		s1.selectByValue("Melbourne");
		Thread.sleep(1500);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room);
		s3.selectByValue("Double");
		Thread.sleep(1500);
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(no);
		s4.selectByIndex(2);
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		date.click();
		date.clear();
		date.sendKeys("15/05/2023");
		Thread.sleep(1500);
		WebElement dat = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dat.click();
		dat.clear();
		dat.sendKeys("20/05/2023");
		Thread.sleep(1500);
		WebElement aduroo = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5 = new Select(aduroo);
		s5.selectByIndex(3);
		Thread.sleep(1000);
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6 = new Select(childroom);
		s6.selectByIndex(4);
		Thread.sleep(1500);
		WebElement ser = driver.findElement(By.xpath("//input[@type='submit']"));
		ser.click();
		Thread.sleep(1000);
		WebElement cl = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		cl.click();
		Thread.sleep(1000);
		WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
		cont.click();
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("Dinesh");
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("Kumar");
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//textarea[@id='address']"));
		add.sendKeys("3/143, attur(tk),salem(dt),pincode:636102");
		Thread.sleep(1000);
		WebElement carno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		carno.sendKeys("1233456675668876");
		Thread.sleep(1000);
		WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(card);
		s7.selectByValue("VISA");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8 = new Select(month);
		s8.selectByValue("3");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(year);
		s9.selectByVisibleText("2025");
		Thread.sleep(1000);
		WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		cvv.sendKeys("777");
		Thread.sleep(1000);
		WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		book.click();

	}

}
