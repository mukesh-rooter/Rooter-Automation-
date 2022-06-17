package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scores {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("wzrk-cancel")).click();
	 //  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='SCORES']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(25, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[30]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Fixtures']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Fantasy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ODI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text()[.='Series']/ancestor::button[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(5, document.body.scrollHeight)");
	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ODI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Teams']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollTo(5, document.body.scrollHeight)");
	Thread.sleep(2000);
	js111.executeScript("scroll(0, 5);");
		driver.findElement(By.xpath("//text()[.='India']/ancestor::div[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 5);");
		driver.findElement(By.className("MuiSvgIcon-root")).click();
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 5);");
		//driver.findElement(By.xpath("//input[@type='text'][@id='commentInput']")).sendKeys("India");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	//	driver.findElement(By.xpath("//text()[.='SCORES']/ancestor::div[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Players']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Rohit Sharma']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 5);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Career Stats']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 5);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Ranking']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js11111111.executeScript("window.scrollTo(20, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bowling']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 10);");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bowling']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ODI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='All-Rounders']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ODI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Teams']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1111111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js1111111111.executeScript("window.scrollTo(20, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ODI']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(15, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='T20']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111111111 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js111111111111.executeScript("window.scrollTo(15, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='HOME']")).click();
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
		
		
		
		
		
	
		
			
	

