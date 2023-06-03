package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMA {

	public static void main(String[] args) throws InterruptedException {
	
		// Arrange
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		// Test Case 1 
		// Action
		WebElement username =driver.findElement(By.cssSelector("input[name=username]"));
		WebElement password =driver.findElement(By.cssSelector("input[type=password]"));
		WebElement loginbutton =driver.findElement(By.cssSelector("button[type=submit]"));
		
		
		// Valid Credentials
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
		Thread.sleep(5000);
		WebElement brandlogo = driver.findElement(By.cssSelector("div[class='oxd-brand-banner']"));
		boolean displaylogo = brandlogo.isDisplayed();
		if (displaylogo) {
		System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
			
		
		
		driver.close();
		
		
	}

}
