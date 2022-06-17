package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileScreen {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text()[.='PROFILE']/ancestor::span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number'][@id='mobile']")).sendKeys("8700619244");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='user-avatar']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("wzrk-cancel")).click();
		   Thread.sleep(2000);
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
			Thread.sleep(2000);
			js1.executeScript("scroll(0, 10);");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Broadcasts']")).click();
			 Thread.sleep(2000);
			   JavascriptExecutor js11 = (JavascriptExecutor) driver;
				js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
				Thread.sleep(2000);
				js11.executeScript("scroll(0, 10);");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='HOME']")).click();
	
	
	
	
	
	}
	
	}

	
	
	
	
	
	
	
	
	
	

