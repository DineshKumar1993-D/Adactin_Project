package com.Selenium_Project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_Project {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdine\\eclipse-workspace\\Selenium_Program\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement nykaa = driver.findElement(By.xpath("(//a[@target='_blank'])[687]"));
		Actions a = new Actions(driver);
		a.clickAndHold(nykaa).perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement hair = driver.findElement(By.xpath("(//a[@target='_blank'])[720]"));
		hair.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> s = driver.getWindowHandles();
		for (String str : s) {
			String title = driver.switchTo().window(str).getTitle();
		}

		WebElement oil = driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]"));
		oil.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> s1 = driver.getWindowHandles();
		for (String str : s1) {
			String title1 = driver.switchTo().window(str).getTitle();
		}

		WebElement add = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		add.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement cart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		cart.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.switchTo().frame(0);
		WebElement but = driver.findElement
		(By.xpath("//iframe[@cd_frame_id_='9fdd89806641669c9c241870a21845ad']"));
		driver.switchTo().frame(but);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement proc = driver.findElement
				(By.xpath("(//button[@class='css-1h4559r e8tshxd0'])[2]"));
		proc.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement gues = driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		gues.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement pin = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		pin.sendKeys("636102");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement house = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		Actions a1 = new Actions(driver);
		a1.sendKeys(house, "Srivari").perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement room = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		room.sendKeys("Attur(tk),Salem(Dt)");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("Dineshkumar");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement phne = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phne.sendKeys("9843099435");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement mail = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		mail.sendKeys("pdineshkumar03@gmail.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement ship = driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
		ship.click();

	}

}
