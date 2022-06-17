package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scorecard {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mac/eclipse-workspace/Mukesh/lib/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobile.rootersports.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span[1]/strong[1]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.id("wzrk-cancel")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Scorecard']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//span[text()='Scorecard']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Commentary']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Ball By Ball']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Partnerships']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Fixtures']")).click();
    Thread.sleep(2000);
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
	js1.executeScript("scroll(0, 15);");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Preview']")).click();
    Thread.sleep(2000);
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollTo(4, document.body.scrollHeight)");
	js1.executeScript("scroll(0, 6);");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Fantasy']")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//text()[.='Fixtures']/ancestor::button[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Partnerships']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Ball By Ball']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Commentary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Scorecard']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Summary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	
	
	
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


