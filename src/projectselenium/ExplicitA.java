package projectselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitA {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("rushie");
		driver.findElement(By.id("password")).sendKeys("rushie");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait explicitWait = new WebDriverWait (driver,Duration.ofSeconds(10));
		WebElement C= driver.findElement(By.id("login"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(C));
		C.click();
		driver.quit();
	}

}
