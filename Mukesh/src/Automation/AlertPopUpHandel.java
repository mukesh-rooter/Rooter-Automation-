package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandel {
public static void main(String [] args) throws InterruptedException {
	
	//System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
	System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi ");
	//driver.findElement(By.className("proceed")).click();
	driver.findElement(By.xpath("//input[@type='submit'][@name='proceed']")).click();
	Thread.sleep(5000);
	Alert alert =driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
	
}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


