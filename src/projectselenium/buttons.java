package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttons {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver () ;
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//double click
		
//		WebElement doubleclick = driver.findElement(By.cssSelector("#doubleClickBtn"));
//		Actions a = new Actions (driver) ;
//		a.doubleClick(doubleclick).build().perform();
//		Thread.sleep(3000);
//		WebElement emsg =driver.findElement(By.cssSelector("#doubleClickMessage"));
//		System.out.println(emsg.getText());
//		if (emsg.isDisplayed()) {
//			System.out.println("test case pass");
//		}
			
		// Right Click
//		WebElement rightclick = driver.findElement(By.cssSelector("#rightClickBtn"));
//		Actions a1 = new Actions(driver);
//		a1.contextClick( rightclick ).build().perform();
//		WebElement emsg1 =driver.findElement(By.cssSelector("#rightClickMessage"));
//		System.out.println(emsg1.getText());
//		if (emsg1.isDisplayed()) {
//			System.out.println("test case pass");
//			
//		}
		
		
		WebElement clickme =driver.findElement(By.cssSelector(" div[id^=\"item_kYWDW\"]"));
		Actions a2 = new Actions(driver);
		a2.click().build().perform();
		
//		System.out.println(emsg2.getText());
//		if (emsg2.isDisplayed()) {
//			System.out.println("test case pass");
	}

	}
