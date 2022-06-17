package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribeSide {
	
		public static void main(String [] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver");
			System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rootersports.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//text()[.='LIVE']/ancestor::div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("wzrk-cancel")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//p[text()='FOLLOW']")).click();
			Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]")).click();
			Thread.sleep(2000);
			
	driver.findElement(By.className("MuiSvgIcon-root")).click();
		((JavascriptExecutor)driver).executeScript("scroll(1,0)");	
		
			
		}
		
}
		

