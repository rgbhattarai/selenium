package projectselenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/login");
		 Wait<WebDriver> wait = new FluentWait<WebDriver> (driver)
				 				.withTimeout(Duration.ofSeconds(30))
				 				.pollingEvery(Duration.ZERO.ofSeconds(5))
				 				.withMessage("Hello")
				 				.ignoring(NoSuchElementException.class);
		 WebElement C= driver.findElement(By.id("login"));
		 wait.until(ExpectedConditions.elementToBeClickable(C));
		 
				
		
	}

}
