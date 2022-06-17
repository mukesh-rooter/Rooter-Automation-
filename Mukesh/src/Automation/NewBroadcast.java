package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBroadcast {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Live Broadcasts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("scroll(0, 10);");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("scroll(0, 10);");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='+ 5']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("scroll(0, 10);");
	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();

		
		
		
	}
	
	
}
		
		
		
		
		

		
		
		
		
		
		
	
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

