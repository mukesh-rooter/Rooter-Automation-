package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewHomePage {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.rooter.gg//");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//p[text()='Log In']")).click();
     Thread.sleep(2000);
     	//driver.findElement(By.xpath("//input[@type='number'][@id='mobile']")).sendKeys("8700619244");
     	driver.findElement(By.xpath("//input[@type='number'][@id='mobile']")).sendKeys("8700619244");
    	Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
     	 Thread.sleep(15000);
	    driver.findElement(By.xpath("//span[text()='Verify Now']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("")).click();
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
		driver.findElement(By.xpath("//p[text()='videos']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11.executeScript("scroll(0, 40);");
		driver.findElement(By.xpath("//p[text()='giveaways']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='gaming']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1111 = (JavascriptExecutor) driver;
		js1111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='free fire']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111 = (JavascriptExecutor) driver;
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='cricket']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111 = (JavascriptExecutor) driver;
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.get("https://web.rootersports.com/live");
		Thread.sleep(7000);
		JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
		js1111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Gaming']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111 = (JavascriptExecutor) driver;
		js11111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Garena Free Fire']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111111 = (JavascriptExecutor) driver;
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='PUBG MOBILE LITE']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1111111111 = (JavascriptExecutor) driver;
		js1111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Youtube']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111111 = (JavascriptExecutor) driver;
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js11111111111.executeScript("scroll(0, 20);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Load more']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Pubg']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111111111 = (JavascriptExecutor) driver;
		js111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Load more']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1111111111111 = (JavascriptExecutor) driver;
		js1111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js1111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("scroll(0, 20);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='GO BACK']")).click();
		Thread.sleep(3000);
		driver.get("https://web.rootersports.com/live");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//p[text()='Matches']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111111111 = (JavascriptExecutor) driver;
		js11111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Topics']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js111111111111111 = (JavascriptExecutor) driver;
		js111111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js111111111111111.executeScript("scroll(0, 40);");
		Thread.sleep(2000);
		driver.get("https://web.rootersports.com/videos");
		Thread.sleep(6000);
		driver.findElement(By.id("LangSelector_svg__Subtraction_25")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}