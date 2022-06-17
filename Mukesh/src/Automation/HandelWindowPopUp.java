package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
     driver.get("http://www.popuptest.com/goodpopups.html");
     driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();//("a[href='http://www.popuptest.com/popup3.html']")).click();
     Thread.sleep(2000);
    Set<String> handler = driver.getWindowHandles();
    // handler.iterator();
     Iterator<String> it = handler.iterator();
     String parentwindowid = it.next();
    System.out.println("parent window id:"+  parentwindowid ); 
     
    String childwindowid = it.next();
     
    System.out.println("parent window id:"+  childwindowid ); 
     driver.switchTo().window("childwindowid");
     Thread.sleep(2000);
     System.out.println(" child window popuo tittle" + driver.getTitle());
     driver.close();
      driver.switchTo().window( parentwindowid );
      Thread.sleep(2000);
      System.out.println(" parent window popuo tittle" + driver.getTitle());
	}

}
