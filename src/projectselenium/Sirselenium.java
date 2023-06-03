package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sirselenium {
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub

	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	
	// Action 

	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("!New@123");
	//driver.findElement(By.id("login")).click();
	Thread.sleep(4000);
	
	WebElement a = driver.findElement(By.id("login"));
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeAsyncScript("arguments[0].click();", a);
	  
	// Assertion 
	  Thread.sleep(9000);
			boolean elemetOnDashBoard =driver.findElement(By.id("books-wrapper")).isDisplayed();
			if(elemetOnDashBoard) {
				System.out.println("Testcase pass");
			}
			else {
				System.out.println("Test case fail");
			}
			
			
		//	driver.close();
			
	 
	}

}
