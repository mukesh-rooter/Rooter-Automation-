package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "//Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
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
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text()[.='VIDEOS']/ancestor::div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='TALKIES']")).click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//span[text()='NEWS']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='TOP 5']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='SOCIAL MEDIA']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='GAMING']")).click();
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='VIRAL']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='OPINION']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='IPL 2020']")).click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='FANTASY']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js11111111111 = (JavascriptExecutor) driver;
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("window.scrollTo(10, document.body.scrollHeight)");
		Thread.sleep(2000);
		js11111111111.executeScript("scroll(0, 40);");
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='HOME']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='videos']")).click();
		
		
		
		
	}
}
