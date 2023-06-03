package projectselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com");
		driver.findElement(By.cssSelector("#autocomplete-textfield > div > div.section-title > h1")).click();
		Set <String> window = driver.getWindowHandles();
		Iterator <String> ii = window.iterator();
		String parentwindow = ii.next();
		String childwindow =ii.next();
		driver.switchTo().window(childwindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.cssSelector("#myInput")).sendKeys("P");
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector("#submit-button")).submit();
//		String url = driver.getCurrentUrl();
//		if (url.contains("Pizza")) {
//			System.out.println("Test case pass");
//		}
		
		driver.findElement(By.cssSelector("#myInput")).sendKeys("P");
		List <WebElement> AA = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));
		 for (int i=0;i<AA.size();i++) {
			 if (AA.get(i).getText().equals("Pancakes")){
				 AA.get(i).click();
				 break;
			 }
				 
			 }
		 driver.findElement(By.cssSelector("#submit-button")).submit();
		
		 String url = driver.getCurrentUrl();
		 if (url.contains("Pancakes")) {
			 System.out.println("test case passed");
		 }
		
		 driver.quit();	
	
	
		
		
	}

}
