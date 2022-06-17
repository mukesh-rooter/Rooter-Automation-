package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {
public static void main(String [] args) {
	System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
	//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox-bin");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://facebook.com/");
	
	//driver.quit();
	//System.out.println(driver.getCurrentUrl()); 
	driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("Anand");
	driver.findElement(By.xpath("//input[@type='text'][@name='lastname']")).sendKeys("jha");
	driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']")).sendKeys("mukesh@rooter.io");
	driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("mukesh@jha");
	
	Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
	  sel1.selectByValue("2");;
	  
	Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
	sel2.selectByVisibleText("Feb");
	Select sel3= new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
	sel3.selectByIndex(5);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	driver.quit();
}
}
	
	





