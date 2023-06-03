package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleinumb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//// Arrangement
		 ChromeDriver driver = new ChromeDriver();
		  driver.get("https://demoqa.com/login");  
		  
		// Action 
		  driver.manage().window().maximize();
		  driver.findElement(By.id("userName")).sendKeys("radmin1");
		  driver.findElement(By.id("password")).sendKeys("Learn@123");
		  driver.findElement(By.id("login")).click();
		 Thread.sleep(2000);// to give time to find elements
		
	}

}
