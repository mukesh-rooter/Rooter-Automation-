package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number'][@id='mobile']")).sendKeys("8700619244");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("")).click();
		// driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
		 
		// driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
		 
		 
		 
		 
		 
		 
	}	
	
}
