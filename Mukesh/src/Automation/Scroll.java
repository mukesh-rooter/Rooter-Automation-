package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rootersports.com/");
		Thread.sleep(2000);
		//((JavascriptExecutor)

			//	driver).executeScript(“window.scrollTo(document.body.scrollHeight,0)”);
        
     driver.findElement(By.id("create_post_svg__b")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("create_post_svg__b")).click();
     Thread.sleep(2000);
     
     
}
}

