package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sidemenu {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
				System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hamburger_svg__Path_67']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("hamburger_svg__Path_65")).click();
	Thread.sleep(5000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollTo(200, document.body.scrollHeight)");
	js1.executeScript("scroll(0, 150);");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='SCORES']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("wzrk-cancel")).click();
	Thread.sleep(2000);
	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	js11.executeScript("window.scrollTo(70, document.body.scrollHeight)");
	js11.executeScript("scroll(0, 50);");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='VIDEOS']")).click();
	Thread.sleep(4000);
	JavascriptExecutor js111 = (JavascriptExecutor) driver;
	js111.executeScript("window.scrollTo(200, document.body.scrollHeight)");
	js111.executeScript("scroll(0, 150);");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='CHANGE LANGUAGE']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='X']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Live Broadcasts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		
	// driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	
	
	
	
	
	
	
	}
}
	
	
	

	
	
	
	
	
	
	
	
	
		
	
	
	


