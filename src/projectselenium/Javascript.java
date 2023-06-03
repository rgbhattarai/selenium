package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com");
		
//		JavascriptExecutor jE = (JavascriptExecutor)driver;
//		String a = "return document.title";
//		Object aa = jE.executeScript(a);
//		System.out.println(aa);
		

		// WebElement
//		JavascriptExecutor jS = (JavascriptExecutor)driver;
//		String a1 = "return document.querySelector('#contact-us')";
//		WebElement aa1 = (WebElement)jS.executeScript(a1);
//		System.out.println(aa1.getText());
//		driver.quit();
		
		// w3school alert 
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement iF =driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(iF);
		JavascriptExecutor jE = (JavascriptExecutor) driver;
		String aa2 = "myFunction()";
		jE.executeScript(aa2);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
