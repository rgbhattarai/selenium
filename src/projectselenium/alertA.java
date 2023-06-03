package projectselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver () ;
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.cssSelector("#alertButton")).click();
//		driver.switchTo().alert().accept();
		driver.manage().window().maximize();

		// alert appearing after 5 sec
//		WebElement e=driver.findElement(By.cssSelector("#timerAlertButton"));
//		e.click();
//		WebDriverWait ew = new WebDriverWait (driver,Duration.ofSeconds(7));
//		ew.until(ExpectedConditions.alertIsPresent());
		
	
		// confirm alert 


//		WebElement ee = driver.findElement(By.cssSelector("#confirmButton"));
//		ee.click();
//		driver.switchTo().alert().accept();
//		if (driver.findElement(By.cssSelector("#confirmResult")).isDisplayed()) {
//			System.out.println("test case pass");
//		}
		
		// cancel alert 
		
		
//		WebElement ee = driver.findElement(By.cssSelector("#confirmButton"));
//		ee.click();
//		driver.switchTo().alert().dismiss();
//		System.out.println(ee.getText());
//		WebElement e=driver.findElement(By.cssSelector("#confirmResult"));
//		//System.out.println(e.getText());
//		if (e.getText().contains("Cancel")) {
//			System.out.println("test case passed");
//		}
//		driver.quit();
		
		// prompt button
		
		WebElement e= driver.findElement(By.cssSelector("#promtButton"));
		Thread.sleep(3000);
		e.click();
		Thread.sleep(3000);
		Alert aa = driver.switchTo().alert();
		aa.sendKeys("rushie");
		aa.accept();
		WebElement aaa = driver.findElement(By.cssSelector("#promptResult"));
		if (aaa.getText().contains("rushie")) {
			System.out.println("Test case passed");
		}
		driver.quit();
		
		
		
		
}
}
