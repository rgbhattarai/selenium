package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertB {

	public static void main(String[] args) throws InterruptedException {
	
//		ChromeDriver driver = new ChromeDriver ();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.cssSelector("#button1")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(6000);
//		driver.quit();
		
		// Confirm ()-accept ()
//		ChromeDriver driver = new ChromeDriver ();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//		driver.findElement(By.cssSelector("#button4")).click();
//		driver.switchTo().alert().accept();
//		String Accepttext = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
//		System.out.println(Accepttext);
//		driver.quit();
//			}
//	}
		// Confirm ()-DISMISS ()
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.findElement(By.cssSelector("#button4")).click();
		driver.switchTo().alert().dismiss();
		String dismissttext1 = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
		System.out.println(dismissttext1);
		}
	}
