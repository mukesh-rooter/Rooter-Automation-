package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rooter {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
	System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rootersports.com/");
	//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
	//Thread.sleep(2000);
	// driver.findElement(By.className("MuiButton-label")).click();
	// driver.findElement(By.xpath("//span[text()='Login']")).click();
	// driver.findElement(By.xpath("//input[@type='number'][@id='mobile']")).sendKeys("8700619244");
	//driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
	// Thread.sleep(15000);
	// driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
		//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		//driver.findElement(By.xpath("//p[text()='LOGOUT']")).click();
//driver.findElement(By.xpath("//text()[.='HOME']/ancestor::div[1]")).click();
//Thread.sleep(2000);
  //driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
  //Thread.sleep(2000);	
  //driver.findElement(By.xpath("//text()[.='SCORES']/ancestor::div[1]")).click();
  //Thread.sleep(2000);
  //driver.findElement(By.id("wzrk-cancel")).click();
  //driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();//
  //Thread.sleep(2000);
  //driver.findElement(By.xpath("//text()[.='VIDEOS']/ancestor::div[1]")).click();
  //Thread.sleep(2000);
  //driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//p[text()='CHANGE LANGUAGE']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[text()='X']")).click();
//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//p[text()='LIVE BROADCASTS']")).click();
//Thread.sleep(2000);
//driver.findElement(By.className("MuiSvgIcon-root")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.id("wzrk-cancel")).click();
//Thread.sleep(9000);
//driver.findElement(By.className("*[class='MuiSvgIcon-root']")).click();
//Thread.sleep(2000);
//driver.findElement(By.className("jss120")).click();
//Thread.sleep(2000);
//driver.findElement(By.className("No thanks")).click();
//driver.findElement(By.id("wzrk-cancel")).click();
//Thread.sleep(2000);
//driver.findElement(By.className("MuiSvgIcon-root MuiSvgIcon-fontSizeSmall")).click();
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollTo(4, document.body.scrollHeight)");
	driver.findElement(By.xpath("p[class='MuiTypography-root jss221 MuiTypography-body2 MuiTypography-colorTextPrimary']")).click();
   //driver.close();

}

}

	
	
	
	
	
	
	
	
	
	
	
	
	


